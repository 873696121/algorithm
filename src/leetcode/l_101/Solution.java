package leetcode.l_101;

import leetcode.l_94.TreeNode;

/***********************************************************                                          *
 * Time: 2022/5/4
 * Author: HuHong
 * Desc: 对称二叉树
 ***********************************************************/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    boolean isSymmetric(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;
        if(a == null || b == null || a.val != b.val) return false;
        return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
    }
}