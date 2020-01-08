package LeetCode.TreeNote;

/**
* @Description:    二叉搜索树的最近公共祖先,https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
* @Author:         kirago
* @CreateDate:     2020/1/8 11:17 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;

        int pVal = p.val;

        int qVal = q.val;

        if(pVal < parentVal && qVal < parentVal) {
            return lowestCommonAncestor(root.left, p, q);
        }else if(pVal > parentVal && qVal > parentVal) {
            return lowestCommonAncestor(root.right, p, q);
        }else {
            return root;
        }
    }
}
