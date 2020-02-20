package LeetCode.TreeNote;

import java.util.HashMap;

/**
* @Description:    从前序与中序遍历构造二叉树，https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
* @Author:         kirago
* @CreateDate:     2020/2/20 6:11 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class BuildTree {

    int[] preOrder;
    int[] inOrder;
    int preIdx = 0;
    HashMap<Integer, Integer> idxMap = new HashMap<>();

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public TreeNode buildTree(int[] preOrder, int[] inOrder){
        this.preOrder = preOrder;
        this.inOrder = inOrder;

        int idx = 0;
        for(int val:inOrder){
            idxMap.put(val, idx++);
        }
        return createTreeCore(0, inOrder.length);
    }

    private TreeNode createTreeCore(int inLeft, int inRight){
        if(inLeft == inRight){
            return null;
        }

        int rootVal = preOrder[preIdx];
        TreeNode root = new TreeNode(rootVal);

        int index = idxMap.get(rootVal);

        preIdx++;
        root.left = createTreeCore(inLeft, index);
        root.left = createTreeCore(index+1, inRight);
        return root;
    }
}
