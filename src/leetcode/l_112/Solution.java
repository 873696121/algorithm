package leetcode.l_112;

import leetcode.l_94.TreeNode;

/***********************************************************                                          *
 * Time: 2022/5/7
 * Author: HuHong
 * Desc: 路径总和
 ***********************************************************/
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return dfs(root, root.val, targetSum);
    }

    boolean dfs(TreeNode root, int sum, int target) {
        if(root.left == null && root.right == null) {
            return sum == target;
        }
        if(root.left != null && dfs(root.left, sum + root.left.val, target)) return true;
        if(root.right != null && dfs(root.right, sum + root.right.val, target)) return true;
        return false;
    }
}
