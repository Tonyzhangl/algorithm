package LeetCode.StringNote;

/**
* @Description:    判断子序列,https://leetcode-cn.com/problems/is-subsequence/
* @Author:         kirago
* @CreateDate:     2020/2/19 11:24 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IsSubsequence {

    // 自实现
    public boolean isSubsequence(String s, String t){
        int si=0,ti=0;
        boolean bt = false;
        for(int i=si;i<s.length();i++){
            bt=false;
            for(int j=ti;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    ti=j+1;
                    bt=true;
                    si = i+1;
                    break;
                }
            }
            if(!bt){
                break;
            }
        }
        return bt;
    }

    // 借鉴优秀题解
    public boolean isSubsequence1(String s,String t){
        char[] str = s.toCharArray();
        int j=-1;
        for(int i=0;i<str.length;i++){
            j = t.indexOf(str[i], j+1);
            if(j==-1){
                return false;
            }
        }
        return true;
    }
}
