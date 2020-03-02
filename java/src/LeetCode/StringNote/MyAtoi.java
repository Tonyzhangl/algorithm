package LeetCode.StringNote;

/**
* @Description:    字符串转整数,https://leetcode-cn.com/problems/string-to-integer-atoi/
* @Author:         kirago
* @CreateDate:     2020/2/13 4:36 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MyAtoi {

    public int myAtoi(String str) {
        int tmp = 1,index=0;
        double ans = 0;
        String s = str.trim();
        if (s.length() == 0) return 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if ( i == 0 && cs[i]== '-') {
                tmp = -1;
                continue;
            }
            if ( i==0 && cs[i]=='+') {
                tmp = 1;
                continue;
            }
            if (Character.isDigit(cs[i])) {
                ans = ans * 10 + Integer.parseInt(String.valueOf(cs[i]));
            } else {
                index = i;
                break;
            }

        }
        if(ans<0 && index == 1) return 0;
        ans = tmp * ans;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) ans;
    }

    public static void main(String[] args){
        String s = "4193 with words";
        MyAtoi myAtoi = new MyAtoi();
        System.out.println(myAtoi.myAtoi(s));
    }
}
