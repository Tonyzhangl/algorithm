package LeetCode;

/**
* @Description:    将有序数组转换为二叉搜索树，https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
* @Author:         kirago
* @CreateDate:     2019/12/18 2:50 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC108 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if( nums == null || nums.length == 0) {
            return null;
        }
        int startIndex = 0, endIndex = nums.length - 1;
        TreeNode treeNode = createTree(nums, startIndex, endIndex);
        return treeNode;
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = start + (end-start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, start, mid -1 );
        root.right = createTree(nums, mid + 1, end);


        return root;
    }
}