package LeetCode;

import java.util.Arrays;

/**
* @Description:    合并两个有序数组,https://leetcode-cn.com/problems/merge-sorted-array/
* @Author:         kirago
* @CreateDate:     2019/11/30 7:51 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,3, nums2,3);
    }
}
