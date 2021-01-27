package LeetCode.TreeNote;

/**
* @description:    剑指 Offer 55 - I. 二叉树的深度
* @author:         kirago
* @date:     2021/1/27 9:44 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class O55 {
    
     class TreeNode{
        private int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val= x;
        }
     }
     
     private int max=0,depth=0;
     
     public int maxDepth(TreeNode root){
         if(root == null) return max;
         inner(root);
         return max;
     }
     
     public void inner(TreeNode root){
         if(root != null){
             depth++;
             max = Math.max(max, depth);
             if(root.left  != null) inner(root.left);
             if(root.right != null) inner(root.right);
             depth--;
         }
     }
}
