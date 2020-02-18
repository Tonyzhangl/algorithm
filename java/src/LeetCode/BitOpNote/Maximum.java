package LeetCode.BitOpNote;

/**
* @Description:    最大数值,https://leetcode-cn.com/problems/maximum-lcci/
* @Author:         kirago
* @CreateDate:     2020/2/18 10:37 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Maximum {

    public int maximum(int a, int b){
        double aD = new Integer(a).doubleValue();
        double bD = new Integer(b).doubleValue();
        double ans =  ((aD+bD)+Math.abs(aD-bD))/2.0;
        return new Double(ans).intValue();
    }
}
