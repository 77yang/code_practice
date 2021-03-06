package com.yang7;

public class 环形链表 {
    public class Solution {
        public boolean hasCycle(ListNode head) {

            ListNode fast = head;
            ListNode slow = head;

            while (fast != null) {
                fast = fast.next;

                if (fast == null) {
                    return false;
                }

                fast = fast.next;
                if (fast == slow) {
                    return true;
                }
                slow = slow.next;
            }
            return false;
        }
    }
}
