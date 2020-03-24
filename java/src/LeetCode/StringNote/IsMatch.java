package LeetCode.StringNote;

/**
* @Description:    正则匹配,https://leetcode-cn.com/problems/regular-expression-matching/
* @Author:         kirago
* @CreateDate:     2020/3/24 5:35 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IsMatch {

    public boolean isMatch(String s, String p){
        if(p.isEmpty()) return s.isEmpty();
        boolean firstMatch = (!s.isEmpty()) && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if(p.length() >=2 && p.charAt(1) == '*'){
            return isMatch(s,p.substring(2)) || (firstMatch && isMatch(s.substring(1),p));
        }else{
            return isMatch(s.substring(1), p.substring(1));
        }
    }
}
