package LeetCode.DPNote;

/**
* @Description:    最小路径和,https://leetcode-cn.com/problems/minimum-path-sum/
* @Author:         kirago
* @CreateDate:     2020/3/10 7:10 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MinPathSum {

    public int minPathSum(int[][] grid) {
        int rlen = grid.length;
        int clen = grid[0].length;
        int[][] dp = new int[rlen][clen];
        dp[0][0] = grid[0][0];
        for(int i=1;i<rlen;i++){
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }

        for(int i=1;i<clen;i++){
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }

        for(int i=1;i<rlen;i++){
            for(int j=1;j<clen;j++){
                dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[rlen-1][clen-1];

    }

    public static void main(String[] args){
        int[][] grid = new int[][]{
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };

        MinPathSum minPathSum = new MinPathSum();
        minPathSum.minPathSum(grid);
    }
}
