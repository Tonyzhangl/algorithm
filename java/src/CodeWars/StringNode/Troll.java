package CodeWars.StringNode;

import java.util.HashSet;
import java.util.Set;

/**
* @Description:    去除元音字母，https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
* @Author:         kirago
* @CreateDate:     2020/1/8 5:50 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Troll {

    public static String disemovel(String s) {
        Set<Character> set = new HashSet<Character>(){{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(char c:chars) {
            if(!set.contains(c)){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
