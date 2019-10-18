//https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/submissions/

package LeetCode;


import java.util.HashMap;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int i=0,j=1,max=0;
        for(;i<s.length();i++) {
            if(hashMap.containsKey(s.charAt(i))) {
                j = hashMap.get(s.charAt(i));
                max = Math.max(max, hashMap.size());
                hashMap.clear();
                for(int inner=j+1;inner<=i;inner++) {
                    hashMap.put(s.charAt(inner),inner);
                }
                continue;
            }
            hashMap.put(s.charAt(i),i);
        }
        max = Math.max(max, hashMap.size());
        return max;
    }


}
