package LeetCode.DPNote;

/**
* @Description:    不同路径,https://leetcode-cn.com/problems/unique-paths/
* @Author:         kirago
* @CreateDate:     2020/3/3 2:18 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class UniquePath {

    public int uniquePath(int m, int n){
        int[][] path = new int[m+1][n+1];
        if(m == 1 || n == 1 ) return 1;
        for(int i=1;i<=n;i++) {
            path[1][i] = 1;
        }
        for(int j=1;j<=m;j++){
            path[j][1] = 1;
        }
        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                path[i][j] = path[i][j-1] + path[i-1][j];
            }
        }
        return path[m][n];
    }

    public static void main(String[] args){
        UniquePath uniquePath = new UniquePath();
        System.out.println(uniquePath.uniquePath(3,2));
    }
}
