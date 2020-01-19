package LeetCode.DPNote;

import java.util.Arrays;

/**
* @Description:    打家劫舍,https://leetcode-cn.com/problems/house-robber/
* @Author:         kirago
* @CreateDate:     2020/1/19 2:55 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Rob {

    public int rob(int[] nums) {
    int preMax = 0, currMax = 0;
    for(int x:nums) {
        int temp = currMax;
        currMax = Math.max(preMax + x, currMax);
        preMax = temp;
    }
    return currMax;
    }
}

