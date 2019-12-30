package LeetCode.MathNote;

import java.util.HashSet;
import java.util.Set;

/**
* @Description:    快乐数字,https://leetcode-cn.com/problems/happy-number/
* @Author:         kirago
* @CreateDate:     2019/12/30 3:47 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class HappyNum {

    public static boolean isHappy(int x){
        Set<Integer> set = new HashSet<>();
        set.add(x);
        while(x != 1) {
            x = sumN(x);
            if(set.contains(x)) return false;
            set.add(x);
        }
        return true;
    }

    /**
     *
     * @param x
     * @return 这里的处理还是比较有技巧的
     */
    public static int sumN(int x) {
        int sum=0;
        int num;
        while(x != 0) {
            num = x % 10;
            x = x / 10;
            sum += num*num;
        }
        return sum;
    }

    public static void main(String[] args) {
        isHappy(19);
    }



}
