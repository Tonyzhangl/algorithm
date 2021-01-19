package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.List;

/**
* @description:    6. Z 字形变换
* @author:         kirago
* @date:     2021/1/19 11:42 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC6 {
    public String convert(String s,int n){
        boolean goingDown = false;
        int numRow = Math.min(s.length(),n);
        int rowIndex = 0;
        List<StringBuilder> list = new ArrayList<>();
        
        if(n==1) return s;
        for(int i=0;i<numRow;i++){
            list.add(new StringBuilder());
        }
        for(char c:s.toCharArray()){
            list.get(rowIndex).append(c);
            if(rowIndex==0 || rowIndex == numRow-1){
                goingDown = !goingDown;
            }
            rowIndex += goingDown ? 1 : -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(StringBuilder t:list){
            sb.append(t.toString());
        }
        return sb.toString();
    }
}
