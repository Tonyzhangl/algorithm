package LeetCode;

/**
* @Description:    经典的DP问题，爬楼梯，https://leetcode-cn.com/problems/climbing-stairs/
* @Author:         kirago
* @CreateDate:     2019/11/30 4:45 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC70 {

    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        if( n<=3) {
            return n;
        }
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2] ;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
