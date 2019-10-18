/**
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 *
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 * 解题思路： 借助数据结构栈来完成
 */



package LeetCode;

import com.sun.tools.javac.util.StringUtils;

import java.util.Stack;

public class LC1047 {
    public String removeDuplicates(String s) {
        Stack<Character> chars = new Stack<>();
        if (s.length() == 1) {
            return s;
        }
        chars.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++) {
            if(chars.empty()) {
                chars.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i) == chars.peek()) {
                chars.pop();
            }else {
                chars.push(s.charAt(i));
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (Character character:chars){
           stringBuffer.append(character);
        }
        return stringBuffer.toString();
    }
}
