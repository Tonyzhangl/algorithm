package LeetCode.ListNote;

import java.util.*;

/**
* @Description:    缺失数字,https://leetcode-cn.com/problems/missing-number/
* @Author:         kirago
* @CreateDate:     2020/1/9 5:13 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0) return 0;
        if(nums[nums.length-1] != nums.length) return nums.length;
        for(int i=0;i<nums.length;i++) {
            if(nums[i+1] - nums[i] > 1) {
                return nums[i]+1;
            }
        }
        return -1;
    }
}
