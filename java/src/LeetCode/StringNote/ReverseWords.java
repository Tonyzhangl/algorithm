package LeetCode.StringNote;

/**
* @Description:    反转字符串中的单词II,https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
* @Author:         kirago
* @CreateDate:     2020/1/8 2:13 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ReverseWords {

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        int len = strs.length;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<len;i++) {
            StringBuffer stringBuffer = new StringBuffer(strs[i]);
            String tmp = i== len-1 ? stringBuffer.reverse().toString() : stringBuffer.reverse().toString() + " ";
            stringBuilder.append(tmp);
        }
        return stringBuilder.toString();
    }
}
