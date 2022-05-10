package leetcode.l100_199.l_104;

import leetcode.l1_99.l_94.TreeNode;

/***********************************************************                                          *
 * Time: 2022/5/4
 * Author: HuHong
 * Desc: 二叉树的最大深度
 ***********************************************************/
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
