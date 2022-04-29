package leetcode.l_2;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        int k = 0;
        for (ListNode p = dummy; l1 != null || l2 != null || k > 0; ) {
            if (l1 != null) {
                k += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                k += l2.val;
                l2 = l2.next;
            }
            p = p.next = new ListNode(k % 10);
            k /= 10;
        }
        return dummy.next;
    }
}