package LeetCode.ListNote;

/**
* @Description:    买卖股票的最佳时机II，https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
* @Author:         kirago
* @CreateDate:     2020/2/27 9:51 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MaxProfit {

    public int maxProfit(int[] nums){
        if(nums.length<=1) return 0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans += nums[i]-nums[i-1];
            }
        }
        return ans;
    }
}
