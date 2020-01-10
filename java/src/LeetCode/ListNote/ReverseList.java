package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.Arrays;

/**
* @Description:    旋转数组,https://leetcode-cn.com/problems/rotate-array/
* @Author:         kirago
* @CreateDate:     2020/1/9 5:33 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ReverseList {

    public void rotate(int[] nums, int k) {
        // k % nums.length -> 2k+1 的偏移实际上就是偏移1位
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
