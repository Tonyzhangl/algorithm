package LeetCode.TreeNote;

/**
* @Description:    验证二叉搜索树,https://leetcode-cn.com/problems/validate-binary-search-tree/
* @Author:         kirago
* @CreateDate:     2020/3/3 12:47 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IsValidBST {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }
    public boolean isValidBST(TreeNode root){
        return recursion(root,null,null);
    }

    private boolean recursion(TreeNode root, Integer low, Integer upper){
        if(root == null) return true;

        int rootV = root.val;

        if(low != null && rootV <= low) return false;
        if(upper != null && rootV >= upper) return false;

        if(!recursion(root.right, rootV, upper)) return false;
        if(!recursion(root.left,low,rootV)) return false;
        return true;
    }

    public static void main(String[] args){
        IsValidBST isValidBST = new IsValidBST();
        IsValidBST.TreeNode root = isValidBST.new TreeNode(2);
        IsValidBST.TreeNode left = isValidBST.new TreeNode(1);
        IsValidBST.TreeNode right = isValidBST.new TreeNode(3);
        root.left = left;
        root.right = right;
        isValidBST.isValidBST(root);

    }
}
