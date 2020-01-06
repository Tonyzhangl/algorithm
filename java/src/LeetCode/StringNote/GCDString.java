package LeetCode.StringNote;

/**
* @Description:    字符串的最大公因子,https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/
* @Author:         kirago
* @CreateDate:     2020/1/6 10:05 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class GCDString {

    private static String gcdOfStrings(String str1, String str2){
        if( !((str1 + str2).equals (str2 + str1))) return "";
        return str1.substring(0,gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }

    public static void main(String[] args) {
        String a = "ABCABC", b = "ABC";
        System.out.println(gcdOfStrings(a,b));
    }
}
