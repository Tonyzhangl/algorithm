package LeetCode;

import java.util.*;

/**
* @Description:    二叉树的层次遍历，https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
* @Author:         kirago
* @CreateDate:     2019/12/16 2:32 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC107 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> list = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        if(root == null) {
            return list;
        }

        while (!queue.isEmpty()) {
            List<Integer> innerList = new ArrayList<>();

            int length = queue.size();

            for(int i=0;i<length;i++) {
                TreeNode treeNode = queue.poll();
                innerList.add(treeNode.val);

                if(treeNode.left != null) {
                    queue.add(treeNode.left);
                }

                if(treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }

            ((LinkedList<List<Integer>>) list).addFirst(innerList);
        }

        return list;

    }
}
