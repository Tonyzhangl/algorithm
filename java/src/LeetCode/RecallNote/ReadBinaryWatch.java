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
    List<String> ans = new ArrayList<>();

    public List<String> readBinaryWatch(int num) {

        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                // 此处时位向左移动6位表示小时位，通过或运算得到分钟位置的1的个数
                if(Integer.bitCount(i << 6 | j) == num){
                    ans.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return ans;
    }

    public List<String> readBinaryWatch2(int num){
        int[] stat = new int[10];
        sub(num, 0, 0, stat);
        return ans;
    }

    private void sub(int num,int start, int cnt, int[] stat){
        if(cnt == num){
            int hour = stat[0]*8+stat[1]*4+stat[2]*2+stat[3];
            int minu = stat[4]*32+stat[5]*16+stat[6]*8+stat[7]*4+stat[8]*2+stat[9];
            if(hour<12 && minu<60){
                String s = String.format("%d:%02d", hour, minu);
                ans.add(s);
            }
            return;
        }

        for(int i=start;i<=(9-(num-cnt)+1);i++){
            stat[i] = 1;
            sub(num, i+1, cnt+1, stat);
            stat[i] = 0;
        }
        return;
    }

}
