package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
* @Description:    有效的括号，https://leetcode-cn.com/problems/valid-parentheses/
* @Author:         kirago
* @CreateDate:     2019/11/24 1:45 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class LC20 {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        Stack<Character> stack = new Stack<>();
        if(s.length()%2 != 0) {
            return false;
        }
        for(int i=0;i<s.length();i++) {
            try {
                if(stack.empty()){
                    if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                        return false;
                    }else {
                        stack.push(s.charAt(i));
                    }
                }else if(map.get(stack.peek()) == s.charAt(i)) {
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }catch (NullPointerException e){
                return false;
            }
        }
        if(stack.empty()) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        if(isValid("([)]")){
            System.out.println("Success");
        }
    }

}
