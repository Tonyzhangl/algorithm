package LeetCode.ListNote;

import java.util.Arrays;

/**
* @Description:    存在重复,https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
* @Author:         kirago
* @CreateDate:     2020/2/27 10:23 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ContainDuplicate {

    public boolean containDuplicate(int[] nums){
        if(nums.length<=1) return false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
