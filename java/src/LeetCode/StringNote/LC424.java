package LeetCode.StringNote;


/**
* @description:    424. 替换后的最长重复字符
* @author:         kirago
* @date:     2021/2/2 4:54 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC424 {
    public int characterReplacement(String s,int k){
        int[] chars = new int[26];
        int left=0,right=0,maxn=0,n=s.length();
        while(right<n){
            chars[s.charAt(right)-'A']++;
            maxn = Math.max(maxn,chars[s.charAt(right)-'A']);
            if(right-left+1-maxn>k){
                chars[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return right-left;
    }

    public static void main(String[] args) {
        LC424 lc424 = new LC424();
        lc424.characterReplacement("ABCAAB",2);
    }
}
