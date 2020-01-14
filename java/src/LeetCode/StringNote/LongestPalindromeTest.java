package LeetCode.StringNote;

public class LongestPalindromeTest {

    public static  void main(String[] args) {
        String str = "cbbd";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ansStr = longestPalindrome.longestPalindrome(str);
        System.out.println(ansStr);
    }
}
