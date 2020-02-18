package LeetCode.TreeNote;

import java.util.*;

/**
* @Description:    二叉树的锯齿形层次遍历,https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
* @Author:         kirago
* @CreateDate:     2020/2/18 11:38 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ZigzagLevelOrder {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if (root == null) return ans;
        linkedList.add(root);
        int tag = 0;
        while (!linkedList.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = linkedList.size();
            while (size-- > 0) {
                TreeNode tree = linkedList.removeFirst();
                list.add(tree.val);
                if (tree.left != null) {
                    linkedList.add(tree.left);
                }
                if (tree.right != null) {
                    linkedList.add(tree.right);
                }
            }
            if (tag == 0) {
                ans.add(list);
                tag = 1;
            }
            else {
                Collections.reverse(list);
                ans.add(list);
                tag = 0;
            }
        }
        return ans;
    }
}
