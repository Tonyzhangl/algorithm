package LeetCode.StringNote;

/**
* @Description:    外观数列,https://leetcode-cn.com/problems/count-and-say/
* @Author:         kirago
* @CreateDate:     2020/3/2 8:21 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CountAndSay {

    public String countAndSay(int n){
        if(n == 1) return "1";
        return recursion(countAndSay(n-1));
    }


    private String recursion(String s){
        int count = 1;
        char num = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(c == num){
                count++;
            }else{
                sb.append(count);
                sb.append(num);
                count = 1;
                num = c;

            }
        }
        sb.append(count);
        sb.append(num);
        return sb.toString();
    }
}
