package LeetCode;

/**
* @Description:    最大序列和，https://leetcode-cn.com/problems/maximum-subarray/
* @Author:         kirago
* @CreateDate:     2019/11/25 8:27 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC53 {

    public static int maxSubArray(int[] nums) {
        int r = 0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            r = r+nums[i];
            if(r<nums[i]){
                r = nums[i];
            }
            max = Math.max(r,max);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
