package LeetCode.HashNote;

import java.util.HashMap;

/**
* @Description:    有效的数独，https://leetcode-cn.com/problems/valid-sudoku/
* @Author:         kirago
* @CreateDate:     2020/1/15 9:24 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IsValidSudoku {

    /** 拆分为三个维度：
     * 1、同一行是否出现相同的数字
     * 2、同一列是否出现相同的数字
     * 3、3x3 的大单元格是否出现相同的数字，这里的大单元格的表示分析则为 boxes= (i/3)*3+j/3
     *
     * 借助于 HashMap，通过判断 rows[],columns[],boxes[] 中对应索引的位置 value -> count 是否大于1
     * 来判断，大于1 说明出现过则直接返回 false，否则返回 true。
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] columns = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++){
                char item = board[i][j];
                if(item != '.') {
                    int n = (int) item;
                    int boxesIndex = (i/3)*3+j/3;
                    rows[i].put(n,rows[i].getOrDefault(n, 0) + 1);
                    columns[j].put(n,columns[j].getOrDefault(n, 0) + 1);
                    boxes[boxesIndex].put(n,boxes[boxesIndex].getOrDefault(n, 0)+1);

                    if(rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[boxesIndex].get(n) > 1){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
