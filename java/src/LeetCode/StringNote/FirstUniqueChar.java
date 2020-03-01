package LeetCode.StringNote;

import java.util.HashMap;

/**
* @Description:    字符串中的第一个唯一字符串,https://leetcode-cn.com/problems/first-unique-character-in-a-string/
* @Author:         kirago
* @CreateDate:     2020/3/1 10:50 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class FirstUniqueChar {

    public int firstUniqueChar(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] cs = s.toCharArray();
        for(int i=0;i<cs.length;i++){
            hashMap.put(cs[i], hashMap.getOrDefault(cs[i],0)+1);
        }
        for(char item:cs){
            if(hashMap.get(item) == 1){
                return s.indexOf(item);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
        firstUniqueChar.firstUniqueChar(s);
    }
}
