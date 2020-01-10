package LeetCode.ListNote;

/**
* @Description:    搜寻名人,https://leetcode-cn.com/problems/find-the-celebrity/
* @Author:         kirago
* @CreateDate:     2020/1/10 4:39 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class FindCelebrity {
    public int findCelebrity(int n) {
        int[][] tags = new int[n][n];
        int colIndex=0;
        boolean existColTag =false, existRowTag = false;
        for(int i=0;i<n;i++) {
            int sumCol = 0;
            for(int j=0;j<n;j++) {
                tags[j][i] = knows(j,i) ? 1: 0;
                sumCol += tags[j][i];
            }
            if (sumCol == n){
                colIndex = i;
                existColTag = true;
            }
        }
        if(existColTag) {
            for(int i=0;i<n;i++) {
                int sumRow=0;
                for(int j=0;j<n;j++) {
                    sumRow += tags[i][j];
                }
                if(sumRow == 1) {
                    existRowTag = true;
                    break;
                }
            }

        }
        return existColTag && existRowTag ? colIndex : -1;
    }
}
