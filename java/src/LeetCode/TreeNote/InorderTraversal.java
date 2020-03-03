package LeetCode.TreeNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @Description:    二叉树的中序遍历,https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
* @Author:         kirago
* @CreateDate:     2020/3/3 3:19 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class InorderTraversal {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }

//    递归实现

    /**
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        recursion(root, ans);
        return ans;
    }


    private void recursion(TreeNode root, List<Integer> list){
        if(root != null){
            if(root.left != null){
                recursion(root.left, list);
            }
            list.add(root.val);
            if(root.right != null){
                recursion(root.right, list);
            }
        }
    }

//    迭代实现
    public List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
