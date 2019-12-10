package LeetCode;

import java.util.ArrayDeque;

/**
* @Description:    相同的树，https://leetcode-cn.com/problems/same-tree/
* @Author:         kirago
* @CreateDate:     2019/12/10 9:19 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC100 {

   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

   public static boolean isSameTree(TreeNode p, TreeNode q) {
       if( p == null && q == null) return true;
       if( p == null || q == null) return false;
       if(p.val != q.val) return false;
       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
   }
}
