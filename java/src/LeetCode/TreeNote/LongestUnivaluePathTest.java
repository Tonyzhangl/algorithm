package LeetCode.TreeNote;

public class LongestUnivaluePathTest {

    public static void main(String[] args) {
        LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();
        LongestUnivaluePath.TreeNode treeNode1 = longestUnivaluePath.new TreeNode(5);
        LongestUnivaluePath.TreeNode treeNode2 = longestUnivaluePath.new TreeNode(4);
        LongestUnivaluePath.TreeNode treeNode3 = longestUnivaluePath.new TreeNode(1);
        LongestUnivaluePath.TreeNode treeNode4 = longestUnivaluePath.new TreeNode(1);
        LongestUnivaluePath.TreeNode treeNode5 = longestUnivaluePath.new TreeNode(5);
        LongestUnivaluePath.TreeNode treeNode6 = longestUnivaluePath.new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode1.right = treeNode5;
        treeNode1.right = treeNode6;
        longestUnivaluePath.longestUnivalPath(treeNode1);


    }
}
