package LeetCode.TreeNote;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    不同的二叉搜索树II，https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
* @Author:         kirago
* @CreateDate:     2020/1/21 3:09 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class GenerateTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> trees = new ArrayList<>();
        if(n == 0) return trees;
        return generateTree(1,n);
    }

    private List<TreeNode> generateTree(int start, int end){
        List<TreeNode> ans = new ArrayList<>();

        if(start > end) {
            ans.add(null);
            return ans;
        }

        for(int i=start;i<=end;i++) {

            List<TreeNode> subLeftTree = generateTree(start, i-1);
            List<TreeNode> subRightTree = generateTree(i+1, end);

            for(TreeNode l:subLeftTree){
                for(TreeNode r:subRightTree) {
                    TreeNode currentTree = new TreeNode(i);
                    currentTree.left = l;
                    currentTree.right = r;
                    ans.add(currentTree);
                }
            }
        }
        return ans;
    }
}
