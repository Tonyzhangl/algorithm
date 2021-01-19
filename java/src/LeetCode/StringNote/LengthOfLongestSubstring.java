package LeetCode.StringNote;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    
    public int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        if(s.length()==0) return 0;
        int i=0,j=0,max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max =  Math.max(max, j-i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcade";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        lengthOfLongestSubstring.lengthOfLongestSubstring(s);
    }
}
