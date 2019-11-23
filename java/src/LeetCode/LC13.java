package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
* @Description:    罗马数字转整数 https://leetcode-cn.com/problems/roman-to-integer/
* @Author:         kirago
* @CreateDate:     2019/11/23 11:53 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map =  new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result=0;

        for(int i=0;i<s.length();i++){
            int t1 = map.get(s.charAt(i));
            if(i==s.length()-1){
                return result + map.get(s.charAt(i));
            }
            int t2 = map.get(s.charAt(i+1));
            result = t1>=t2 ? result+t1 : result-t1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
