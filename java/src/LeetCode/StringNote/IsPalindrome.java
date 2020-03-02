package LeetCode.StringNote;

/**
* @Description:    验证回文字符串,https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/
* @Author:         kirago
* @CreateDate:     2020/3/2 11:45 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if(len<=1) return true;
        int left=0,right=len-1;
        while(left < right){
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) left++;
            while (!Character.isLetterOrDigit(s.charAt(right)) && left < right) right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                System.out.println(s.charAt(left));
                System.out.println(s.charAt(right));
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(s));

    }


}
