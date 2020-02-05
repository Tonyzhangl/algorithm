package LeetCode.RecallNote;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    二进制手表，https://leetcode-cn.com/problems/binary-watch/
* @Author:         kirago
* @CreateDate:     2020/2/3 10:26 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ReadBinaryWatch {

    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();

        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                // 此处时位向左移动6位表示小时位，通过或运算得到分钟位置的1的个数
                if(Integer.bitCount(i << 6 | j) == num){
                    times.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return times;
    }
}
