package extra;/*
 * Click `Run` to execute the snippet below!
 */

/*
 * To execute Java, please define "static void main" on a class
 * named extra.Solution.
 *
 * If you need more classes, simply define them inline.
 */

/**
 * 反转偶数位置的链表
 * 终点看merge和split的过程
 */

class Solution {

    static class Node {
        int val;
        Node next;

        Node(int _val) {
            val = _val;
            next = null;
        }
    }

    Node head;

    Solution() {
        head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= 5; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
    }

    Node reverse(Node h) {
        Node pre = null;
        for (Node t = h; t != null; ) {
            Node next = t.next;
            t.next = pre;
            pre = t;
            t = next;
        }
        return pre;
    }

    Node[] split(Node head) {
        Node l = new Node(1), r = new Node(1), cl = l, cr = r;
        int i = 0;
        for (Node p = head; p != null; p = p.next) {
            if (i % 2 == 0) cl = cl.next = p;
            else cr = cr.next = p;
            i++;
        }
        cl.next = cr.next = null;
        return new Node[]{l.next, r.next};
    }

    Node merge(Node h1, Node h2) {
        Node dummy = new Node(1), cur = dummy;
        while (h1 != null && h2 != null) {
            cur = cur.next = h1;
            h1 = h1.next;
            cur = cur.next = h2;
            h2 = h2.next;
        }
        while (h1 != null) {
            cur = cur.next = h1;
            h1 = h1.next;
        }
        while (h2 != null) {
            cur = cur.next = h2;
            h2 = h2.next;
        }
        return dummy.next;
    }

    void reverseList() {
        Node[] split = split(head);
        split[1] = reverse(split[1]);
        head = merge(split[0], split[1]);
    }

    void print() {
        for (Node t = head; t != null; t = t.next)
            System.out.print(t.val + " ");
        System.out.println();
    }

    void print(Node h) {
        for (Node t = h; t != null; t = t.next)
            System.out.print(t.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.reverseList();
        s.print();
    }
}
