package LeetCode.TreeNote;

import java.util.HashMap;

/**
* @description:    106. 从中序与后序遍历序列构造二叉树
* @author:         kirago
* @date:     2021/2/19 5:42 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC106 {
    
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    
    private int[] inorder;
    private int[] postorder;
    private HashMap<Integer, Integer> map = new HashMap<>();
    
    public TreeNode buildTree(int[] inorder,int[] postorder){
        this.inorder = inorder;
        this.postorder = postorder;
        int idx = 0;
        for(int item:inorder){
            map.put(item,idx++);
        }
        return helper(0, inorder.length-1);
    }
    
    public TreeNode helper(int head, int tail){
        if(head>tail) return null;
        int rootVal = postorder[tail];
        TreeNode root = new TreeNode(rootVal);
        root.right = helper(map.get(rootVal)+1, tail);
        root.left = helper(head,map.get(rootVal)-1);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        LC106 lc106 = new LC106();
        lc106.buildTree(inorder, postorder);
    }
}
