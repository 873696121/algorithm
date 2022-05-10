package leetcode.l100_199.l_141;

import leetcode.l1_99.l_2.ListNode;

/***********************************************************                                          *
 * Time: 2022/5/10
 * Author: HuHong
 * Desc: 环形链表
 ***********************************************************/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next;
            if(fast == null) return false;
            fast = fast.next;
            if(slow == fast) return true;
        }
        return false;
    }
}