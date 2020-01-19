package LeetCode.ListNote;

import java.util.Arrays;

/**
* @Description:    最接近的三数之和，https://leetcode-cn.com/problems/3sum-closest/
* @Author:         kirago
* @CreateDate:     2020/1/17 4:40 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums,int target){
        int len=nums.length;
        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i=0;i<len;i++) {
            int left=i+1,right=len-1;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(ans - target) > Math.abs(sum - target)) {
                    ans = sum;
                }
                if(sum - target < 0){
                    left++;
                }
                else if(sum -target > 0){
                    right--;
                }
                else return ans;
            }
        }
        return ans;
    }
}
