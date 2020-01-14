package LeetCode.StringNote;

/**
* @Description:    最长回文子串，https://leetcode-cn.com/problems/longest-palindromic-substring/
* @Author:         kirago
* @CreateDate:     2020/1/13 9:45 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LongestPalindrome {

    /** 暴力遍历
    public boolean isPalindrome(String string) {
        int len = string.length();
        for(int i=0;i<len/2;i++) {
            if(string.charAt(i) != string.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String string) {
        int max=0;
        String ans = "";
        for(int i=0;i<string.length();i++) {
            for(int j=i+1;j<=string.length();j++) {
                if(isPalindrome(string.substring(i,j)) && j-i > max) {
                    max = j-i;
                    ans = string.substring(i,j);
                }
            }
        }
        return ans;
    }
     **/

    /** 中心扩散法 **/
    public String longestPalindrome(String string) {
        int len = string.length();
        if(len < 2) {
            return string;
        }

        int max=1;
        String ans = string.substring(0,1);
        for(int i=0;i<len - 1;i++) {
            String oddStr = centerSpread(string, i, i);
            String evenStr = centerSpread(string, i, i+1 );
            String maxStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if(maxStr.length() > max) {
                max = maxStr.length();
                ans = maxStr;
            }
        }
        return ans;
    }

    public String centerSpread(String string, int left, int right) {
        int len = string.length();
        int i= left,j=right;
        while( i >= 0 && j < len) {
            if(string.charAt(i) == string.charAt(j)) {
                i--;
                j++;
            }else {
                break;
            }
        }
        return string.substring(i+1, j);
    }

}
