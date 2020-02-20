package CodingInterview.TreeNote;


import java.util.HashMap;

/**
* @Description:    根据二叉树的前序遍历和中序遍历输出结果构造出原始的二叉树
 * 前序输出为 [1,2,4,7,3,5,6,8]，中序输出为[4,7,2,1,5,3,8,6]
 * 那么构造出的二叉树为
 *         1
 *        / \
 *       2  3
 *      /  / \
 *     4  5  6
 *     \    /
 *     7   8
* @Author:         kirago
* @CreateDate:     2020/2/20 2:48 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CreateBinaryTree {

    int pre_idx = 0;
    int[] preorder;
    int[] inorder;
    //用于存放 inorder 中的数组及其索引值
    HashMap<Integer, Integer> idx_map = new HashMap<>();

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val = x;
        }
    }

    public TreeNode createBinaryTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        this.inorder = inorder;

        int idx=0;
        for(int val:inorder){
            idx_map.put(val, idx++);
        }
        return createBinaryCore(0, inorder.length);

    }

    private TreeNode createBinaryCore(int inLeft, int inRight){
        if(inLeft == inRight){
            return null;
        }
        int rootVal = preorder[pre_idx];
        TreeNode root = new TreeNode(rootVal);

        int index = idx_map.get(rootVal);

        pre_idx++;

        root.left=createBinaryCore(inLeft, index);
        root.right=createBinaryCore(index+1, inRight);
        return root;

    }
}
