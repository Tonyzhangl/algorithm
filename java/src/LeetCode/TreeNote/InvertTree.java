package LeetCode.TreeNote;

/**
* @Description:    翻转二叉树,https://leetcode-cn.com/problems/invert-binary-tree/
* @Author:         kirago
* @CreateDate:     2020/1/6 4:16 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class InvertTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private static TreeNode invertTree(TreeNode treeNode){
        if(treeNode == null) return null;
        TreeNode left = invertTree(treeNode.left);
        TreeNode right = invertTree(treeNode.right);
        treeNode.left = right;
        treeNode.right = left;
        return treeNode;
    }

}
