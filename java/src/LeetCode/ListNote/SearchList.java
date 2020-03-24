package LeetCode.ListNote;

import java.util.Arrays;
import java.util.List;

/**
* @Description:    搜索旋转排序数组,https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
* @Author:         kirago
* @CreateDate:     2020/2/13 8:38 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class SearchList {

    private int[] nums;
    private int target;

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        this.nums = nums;
        this.target = target;

        return recursion(0, nums.length - 1);

    }

    private int recursion(int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
//            前半段有序
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    return recursion(start, mid - 1);
                } else {
                    return recursion(mid + 1, end);
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    return recursion(mid + 1, end);
                } else {
                    return recursion(start, mid - 1);
                }

            }
        }
        return -1;
    }

}

