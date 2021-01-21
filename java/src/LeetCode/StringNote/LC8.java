package LeetCode.StringNote;

/**
* @description:    8. 字符串转换整数 (atoi)
* @author:         kirago
* @date:     2021/1/21 9:49 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC8 {
    public int myAtoi(String str){
        String strT = str.trim();
        int flag = 1;
        double ans = 0;
        char[] strL = strT.toCharArray();
        for(int i=0;i<strL.length;i++){
            if(i==0 && strL[i]=='-'){
                flag = -1;
                continue;
            }else if(i==0 && strL[i]=='+'){
                flag = 1;
                continue;
            }
            if(Character.isDigit(strL[i])){
                ans = ans*10+Integer.valueOf(String.valueOf(strL[i]));
            }else{
                break;
            }
        }
        ans = flag*ans;
        if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)ans;
    }

    public static void main(String[] args) {
        LC8 lc8 = new LC8();
        lc8.myAtoi("-234n");
    }
}
