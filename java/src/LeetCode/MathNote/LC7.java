package LeetCode.MathNote;

/**
* @description:    7. 整数反转
* @author:         kirago
* @date:     2021/1/19 4:56 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC7 {
    public int convert(int x){
        long n = 0;
        while(x!=0){
            n = x%10 + n*10;
            x /= 10;
        }
        return (int)n==n? (int)n:0;
    }
    
}
