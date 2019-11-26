package LeetCode;

import java.util.List;

/**
* @Description:    加一，https://leetcode-cn.com/problems/plus-one/
* @Author:         kirago
* @CreateDate:     2019/11/25 9:08 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC66 {

    public static int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                digits[i] = digits[i] % 10;
                if (digits[i] != 0) return digits;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;

    }

    public static void main(String[] args) {
        int[] t = new int[]{1,3,9};
        System.out.println(plusOne(t));
    }
}
