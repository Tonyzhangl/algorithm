package LeetCode.ListNote;
/**
* @description:    1208. 尽可能使字符串相等
* @author:         kirago
* @date:     2021/2/5 9:51 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int len = s.length();
        int left=0,right=0;
        if(len==0) return ans;
        int[] diff = new int[len];
        for(int i=0;i<len;i++){
            diff[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        while(right<len){
            ans+=diff[right];
            while(ans>maxCost){
                ans-=diff[left++];
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;

    }

    public static void main(String[] args) {
        LC1208 lc1208 = new LC1208();
        lc1208.equalSubstring("npzdfy",
                "xmsgby",14);
    }
}
