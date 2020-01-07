package LeetCode.StringNote;

/**
* @Description:    反转字符串,https://leetcode-cn.com/problems/reverse-string/
* @Author:         kirago
* @CreateDate:     2019/12/30 4:43 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class StringReverse {

    public static void reverseString(char[] s) {
        int len = s.length;
        int beginIndex=0,endIndex=len-1;
        char tmp;
        while(beginIndex < endIndex) {
            tmp = s[endIndex];
            s[endIndex] = s[beginIndex];
            s[beginIndex] = tmp;
            beginIndex++;
            endIndex--;
        }
    }

    public static void main(String[] args) {
        char[] in= {'a','b','c','d'};
        reverseString(in);
    }
}
