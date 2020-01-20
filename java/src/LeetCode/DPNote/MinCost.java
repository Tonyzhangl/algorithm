package LeetCode.DPNote;

/**
* @Description:    粉刷房子,https://leetcode-cn.com/problems/paint-house/
* @Author:         kirago
* @CreateDate:     2020/1/19 5:25 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MinCost {

    public int minCost(int[][] costs){
        int len = costs.length;
        if(len==0) return 0;
        int[][] dp = new int[len][3];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];
        for(int i=1;i<len;i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + costs[i][2];
        }

        return Math.min(Math.min(dp[len-1][0], dp[len-1][1]), dp[len-1][2]);
    }
}
