package LeetCode.DPNote;

/**
* @Description:    不同的二叉树,https://leetcode-cn.com/problems/unique-binary-search-trees/
* @Author:         kirago
* @CreateDate:     2020/3/3 1:33 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class NumTree {

    public int numTree(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args){
        NumTree numTree = new NumTree();
        System.out.println(numTree.numTree(4));
    }
}
