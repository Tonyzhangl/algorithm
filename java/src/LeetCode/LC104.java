package LeetCode;

/**
* @Description:    二叉树的最大深度,https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
* @Author:         kirago
* @CreateDate:     2019/12/16 2:08 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC104 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    /** ------ 递归解法 ----- **/
    /**
    public int maxDepth(TreeNode treeNode) {
        if(treeNode == null) {
            return 0;
        }else {
            int depLeft = maxDepth(treeNode.left);
            int depRight = maxDepth(treeNode.right);
            return Math.max(depLeft, depRight) + 1;
        }
    } **/

    int max = 0, depth = 0;
    /** ----- 迭代解法 ------ **/
    public int maxDepth(TreeNode treeNode) {
        depStack(treeNode);
        return max;
    }

    private void depStack(TreeNode root) {
        if(root != null) {
            depth++;
            max = Math.max(depth, max);
            depStack(root.left);
            depStack(root.right);
            depth--;
        }
    }
}
