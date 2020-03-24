package LeetCode.DFSNote;

/**
* @Description:    岛屿数量,https://leetcode-cn.com/problems/number-of-islands/
* @Author:         kirago
* @CreateDate:     2020/3/24 6:08 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class NumIslands {

    private int rl;
    private int cl;

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 ) return 0;

        this.rl = grid.length;
        this.cl = grid[0].length;
        int ans=0;
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(grid[i][j] == '1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid,int r, int c){
        if(r<0 || r>=rl || c<0 || c > cl || grid[r][c] == '0') return;
        grid[r][c] = '0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
