package LeetCode.TreeNote;

/**
* @Description:    最长同值路径，https://leetcode-cn.com/problems/longest-univalue-path/
* @Author:         kirago
* @CreateDate:     2020/1/21 4:20 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LongestUnivaluePath {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private int ans=0;

    public int longestUnivalPath(TreeNode root) {

        helper(root);
        return ans;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);

        left = (root.left != null && root.left.val == root.val) ? left+1 : 0;
        right = (root.right != null && root.right.val == root.val) ? right+1 : 0;
        ans = Math.max(ans , left + right);
        return Math.max(left, right);
    }
}
