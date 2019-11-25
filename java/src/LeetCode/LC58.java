package LeetCode;

import java.util.List;

/**
* @Description:    最后一个单词的长度,https://leetcode-cn.com/problems/length-of-last-word/
* @Author:         kirago
* @CreateDate:     2019/11/25 8:46 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC58 {
    public static int lengthOfLastWord(String s) {
        if(s.trim().equals("")) {
            return 0;
        }else{
            String[] list = s.split(" ");
            return list[list.length-1].length();
        }
    }

    public static void main(String[] args) {
        String s = "   ";
        System.out.println(lengthOfLastWord(s));
    }
}
