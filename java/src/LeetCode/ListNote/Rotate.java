package LeetCode.ListNote;

/**
* @Description:    旋转数组,https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
* @Author:         kirago
* @CreateDate:     2020/2/27 10:03 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Rotate {
    public void rotate(int[] nums, int k){
        int len = nums.length;
        int rotateIndex = k % len;
        reverse(0, len-1, nums);
        reverse(0, k-1, nums);
        reverse(k,len-1,nums);
    }

    public void reverse(int left, int right, int[] nums){
        while(left < right){
            int tmp = nums[right];
            nums[right]=nums[left];
            nums[left]=tmp;
            left++;
            right--;
        }
    }
}
