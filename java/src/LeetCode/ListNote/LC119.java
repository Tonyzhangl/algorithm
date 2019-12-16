package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.List;

public class LC119 {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        // if(rowIndex == 0) {
        //     return new ArrayList<Integer>();
        // }

        lists.add(new ArrayList<>());
        lists.get(0).add(1);

        for(int i=1;i<=rowIndex;i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = lists.get(i-1);

            row.add(1);

            for(int j=1;j<i;j++){ //此部分注意判断条件为i，即与preRow进行比较处理。
                row.add(preRow.get(j-1) + preRow.get(j));
            }
            row.add(1);
            lists.add(row);
        }
        return lists.get(rowIndex);
    }
}
