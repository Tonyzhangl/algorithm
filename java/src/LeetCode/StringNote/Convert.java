package LeetCode.StringNote;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    Z字形变换，https://leetcode-cn.com/problems/zigzag-conversion/
* @Author:         kirago
* @CreateDate:     2020/1/19 2:11 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Convert {

    public String convert(String string, int nums) {
        int rowNums = Math.min(string.length(), nums);
        if(nums == 1) return  string;
        List<StringBuilder> list = new ArrayList<>();
        for(int i=0;i<rowNums;i++){
            list.add(new StringBuilder());
        }
        int rowIndex = 0;
        // 此时的 goingDown 是需要初始化为 false,因为初始情况是从第一行开始的
        boolean goingDown = false;
        for(char c:string.toCharArray()){
            list.get(rowIndex).append(c);
            if(rowIndex==0 || rowIndex ==rowNums-1 ) goingDown = !goingDown;
            rowIndex += goingDown ? 1 : -1;
        }
        StringBuilder sp = new StringBuilder();
        for(StringBuilder s:list) {
            sp.append(s.toString());
        }

        return sp.toString();
    }
}
