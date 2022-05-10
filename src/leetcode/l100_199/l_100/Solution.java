package leetcode.l100_199.l_100;

import leetcode.l1_99.l_94.TreeNode;

/***********************************************************                                          *
 * Time: 2022/5/4
 * Author: HuHong
 * Desc: 相同的树
 ***********************************************************/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}