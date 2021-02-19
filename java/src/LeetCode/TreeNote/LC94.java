package LeetCode.TreeNote;

import java.util.*;

/**
* @description:    94. 二叉树的中序遍历
* @author:         kirago
* @date:     2021/2/19 2:24 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC94 {
    
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

//    递归解法 
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list  = new ArrayList<>();
        helper(root,list);
        return list;
    }
    
    public void helper(TreeNode root,List<Integer> list){
        if(root==null) return;
        if(root.left != null) helper(root.left, list);
        list.add(root.val);
        if(root.right != null) helper(root.right, list);
    }
    
//    迭代解法
    public List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<>();
        while(root != null || !stk.isEmpty()){
            while (root != null){
                stk.add(root);
                root = root.left;
            }
            root = stk.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
