package LeetCode;

/**
* @Description:    x 的平方根，https://leetcode-cn.com/problems/sqrtx/
* @Author:         kirago
* @CreateDate:     2019/11/26 3:48 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC69 {
    public static int mySqrt(int x) {
        double r;
        r = Math.sqrt((double) x);
        return new Double(r).intValue();
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
}