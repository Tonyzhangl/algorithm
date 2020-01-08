package LeetCode.MathNote;

/**
* @Description:    Excel表列名称,https://leetcode-cn.com/problems/excel-sheet-column-title/
* @Author:         kirago
* @CreateDate:     2020/1/8 3:36 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ConvertToTitle {

    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            if(c == 0 ) {
                c=26;
                n -= 1;
            }
            stringBuilder.insert(0, (char) ('A' + c -1));
            n /= 26;
        }
        return stringBuilder.toString();
    }
}
