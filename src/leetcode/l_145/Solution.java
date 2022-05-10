package leetcode.l_145;

import leetcode.l_94.TreeNode;

import java.util.ArrayList;
import java.util.List;

/***********************************************************                                          *
 * Time: 2022/5/10
 * Author: HuHong
 * Desc: 二叉树的后序遍历
 ***********************************************************/
class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        res.add(root.val);
    }
}