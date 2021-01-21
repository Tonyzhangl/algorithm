package LeetCode.MathNote;

/**
* @description:    9. 回文数
* @author:         kirago
* @date:     2021/1/21 10:21 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC9 {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }else if(x==0){
            return true;
        }
        int sum = 0,y=x;
        while(y!=0){
            sum = sum*10+y%10;
            y /= 10;
        }
        return sum == x;
    }
}
