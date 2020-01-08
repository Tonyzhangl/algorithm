package LeetCode.MathNote;

/**
* @Description:    Excel表列序号，https://leetcode-cn.com/problems/excel-sheet-column-number/
* @Author:         kirago
* @CreateDate:     2020/1/8 1:57 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TitleToNumber {

    public int titleToNumber(String s) {
        int size = s.length(), sum =0;
        for(int i=0;i<size;i++) {
            int tmp = s.charAt(i) - 'A' + 1;
            sum = sum * 26 + tmp ;
        }
        return sum;
    }
}
