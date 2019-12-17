package LeetCode;

/**
* @Description:    验证回文串，https://leetcode-cn.com/problems/valid-palindrome/
* @Author:         kirago
* @CreateDate:     2019/12/17 3:40 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC125 {

    public static boolean isPalindrome(String s) {
        int startIndex =0 , endIndex=s.length()-1;
        String stmp = s.toLowerCase();
        while(startIndex <= endIndex) {
            while ( !LC125.judgeChart(stmp.charAt(startIndex)) && startIndex < endIndex){
                startIndex++;
            }
            while ( !LC125.judgeChart(stmp.charAt(endIndex)) && endIndex > startIndex){
                endIndex--;
            }
            System.out.println(stmp.charAt(startIndex));
            System.out.println(stmp.charAt(endIndex));
            System.out.println("-----");
            if( stmp.charAt(startIndex) == stmp.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            }else {
                return false;
            }
        }
        return true;

    }

    private static boolean judgeChart(Character c) {
        if((c >= 'a' && c <= 'z') || Character.isDigit(c)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
}