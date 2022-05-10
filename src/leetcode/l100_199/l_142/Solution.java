package leetcode.l100_199.l_142;

import leetcode.l1_99.l_2.ListNode;

/***********************************************************                                          *
 * Time: 2022/5/10
 * Author: HuHong
 * Desc: 环形链表 II
 ***********************************************************/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) return null;
            fast = fast.next;
            if (slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}