package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    杨辉三角，https://leetcode-cn.com/problems/pascals-triangle/
* @Author:         kirago
* @CreateDate:     2019/12/16 2:50 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        if(numRows == 0) {
            return lists;
        }

        lists.add(new ArrayList<>());
        lists.get(0).add(1);

        for(int i=1;i<numRows;i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = lists.get(i-1);

            row.add(1);

            for(int j=1;j<i;j++){ //此部分注意判断条件为i，即与preRow进行比较处理。
                row.add(preRow.get(j-1) + preRow.get(j));
            }
            row.add(1);
            lists.add(row);
        }

        return lists;
    }

}
