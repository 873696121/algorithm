package leetcode.l100_199.l_143;

import leetcode.l1_99.l_2.ListNode;

/***********************************************************                                          *
 * Time: 2022/5/10
 * Author: HuHong
 * Desc: 重排链表
 ***********************************************************/
class Solution {

    ListNode reverse(ListNode head) {
        ListNode pre = null;
        for (ListNode p = head; p != null; ) {
            ListNode next = p.next;
            p.next = pre;
            pre = p;
            p = next;
        }
        return pre;
    }

    public void reorderList(ListNode head) {
        if (head == null) return;
        int cnt = 0;
        for (ListNode p = head; p != null; p = p.next) cnt++;
        ListNode l = head, r = head;
        for (int i = 0; i < (cnt - 1) / 2; i++) r = r.next;
        ListNode next = r.next;
        r.next = null;
        r = next;
        r = reverse(r);
        ListNode dummy = new ListNode(-1);
        int i = 0;
        for (ListNode p = dummy; l != null || r != null; p = p.next) {
            if (i++ % 2 == 0) {
                p.next = l;
                l = l.next;
            } else {
                p.next = r;
                r = r.next;
            }
        }
    }

    public void print(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) System.out.print(p.val + " ");
        System.out.println();
    }
}