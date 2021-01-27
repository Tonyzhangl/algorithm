package LeetCode.TreeNote;

/**
* @description:    剑指 Offer 28. 对称的二叉树
* @author:         kirago
* @date:     2021/1/27 9:57 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class O28 {
    
    class TreeNode{
        private int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val= x;
        }
    }
    
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode l,TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        if(l.val == r.val){
            return helper(l.left, r.right) && helper(l.right, r.left);
        }
        return false;
    }
}
