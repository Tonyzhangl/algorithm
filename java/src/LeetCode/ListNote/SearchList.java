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

    private int target;
    private int[] nums;

    public int search(int[] nums,int target){
        this.nums = nums;
        this.target = target;
        int n = nums.length;

        if(n==0) return -1;
        if(n==1){
            return this.nums[0]==target ? 0 : -1;
        }
        int midIndex = findMidIndex(0,n-1);
        if(nums[midIndex] == target) return midIndex;
        if(midIndex == 0) return search(0,n-1);
        if(target<nums[0]) return search(midIndex, n-1);
        return search(0,midIndex);
    }

    private int findMidIndex(int start, int end) {
        if(nums[start] < nums[end]) return 0;
        while (start<=end){
            int mid = (start + end)/2;
            if(nums[mid] > nums[mid+1]) return mid+1;
            else{
                if(  nums[mid] < nums[start]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return 0;
    }

    private int search(int left,int right){
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else{
                if(nums[mid] < target){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
