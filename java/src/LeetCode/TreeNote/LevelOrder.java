package LeetCode.TreeNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @Description:    二叉树的层次遍历，https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
* @Author:         kirago
* @CreateDate:     2020/1/16 10:05 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LevelOrder {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> itemList = new ArrayList<>();
        TreeNode last = root;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if (last == null) {
            return ans;
        }else {
            stack1.push(last);
        }
        while (!stack1.isEmpty()) {
            last = stack1.pop();
            stack2.push(last);
            itemList.add(last.val);
            if(stack1.isEmpty()){
                recursionLevel(stack1, stack2);
                ans.add(itemList);
                itemList = new ArrayList<>();
            }
        }
        return ans;
    }

    private void recursionLevel(Stack<TreeNode> stack1, Stack<TreeNode> stack2) {
        while( !stack2.isEmpty()) {
            TreeNode node = stack2.pop();
            if(node.right != null) {
                stack1.push(node.right);
            }
            if(node.left != null) {
                stack1.push(node.left);
            }
        }
    }
}
