package LeetCode.TreeNote;

/**
* @Description:    二叉树的直径，https://leetcode-cn.com/problems/diameter-of-binary-tree/
* @Author:         kirago
* @CreateDate:     2019/12/30 2:16 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TreeDepthSum {

    int ans;

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    public int diameterOfBinaryTree(TreeNode root){
        int ans = 1;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }


}
