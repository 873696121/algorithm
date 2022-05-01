package leetcode.l_85;

import leetcode.l_2.ListNode;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode l = new ListNode(-1);
        ListNode r = new ListNode(-1);
        ListNode cl = l, cr = r;
        for (ListNode p = head; p != null; ) {
            ListNode next = p.next;
            p.next = null;
            if (p.val < x) {
                cl = cl.next = p;
            } else {
                cr = cr.next = p;
            }
            p = next;
        }
        cl = l;
        while (cl != null && cl.next != null) cl = cl.next;
        if (cl != null) cl.next = r.next;
        return l.next;
    }
}