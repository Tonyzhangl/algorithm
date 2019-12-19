package LeetCode.TreeNote;

/**
* @Description:    平衡二叉树,https://leetcode-cn.com/problems/balanced-binary-tree/
* @Author:         kirago
* @CreateDate:     2019/12/19 2:08 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC110 {

    private static boolean res = true;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isBalanced(TreeNode root) {
         excuteBalanced(root);
         return res;
    }

    private static int excuteBalanced(TreeNode root){
        if (root == null) return 0;
        int left = excuteBalanced(root.left) + 1;
        int right = excuteBalanced(root.right) + 1;
        if (Math.abs(right - left) > 1) res = false;
        return Math.max(left, right);

    }

    public static void main(String[] args) {
        TreeNode root = new LC110.TreeNode(1);
        root.left = new LC110.TreeNode(2);
        root.right = new LC110.TreeNode(2);
        root.left.left = new LC110.TreeNode(3);
        root.left.right = new LC110.TreeNode(3);
        root.left.left.left = new LC110.TreeNode(4);

        isBalanced(root);
    }

}
