package LeetCode;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
* @Description:    对称二叉树,https://leetcode-cn.com/problems/symmetric-tree/
* @Author:         kirago
* @CreateDate:     2019/12/16 10:37 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC101 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode treeNode) {
        return isMirror(treeNode, treeNode);
    }

//    1、 递归方法
    /**
    public boolean isMirror(TreeNode treeNode1, TreeNode treeNode2) {
        if(treeNode1 == null && treeNode2 == null) return true;
        if(treeNode1 == null || treeNode2 == null) return false;
        return (treeNode1.val == treeNode2.val)
                && isMirror(treeNode1.left, treeNode2.right)
                && isMirror(treeNode1.right, treeNode2.left);
        }
     **/
//    2、 迭代
    public boolean isMirror(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null) return true;
            if(t1 == null || t2 == null) return false;
            if(t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t1.right);
            q.add(t2.right);
            q.add(t2.left);
        }
    }
}
