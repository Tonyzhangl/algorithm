package LeetCode.ListNote;

/**
* @Description:    在排序数组中查找元素的第一个和最后一个位置,https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
* @Author:         kirago
* @CreateDate:     2020/4/22 8:43 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int leftIndex = findIndex(nums,target, true);
        if(leftIndex == nums.length || nums[leftIndex] != target){
            return ans;
        }
        ans[0] = leftIndex;
        ans[1] = findIndex(nums,target,false)-1;
        return ans;

    }

    private int findIndex(int[] nums, int target, boolean tag){
        int i=0,j=nums.length;
        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid] > target || (tag && nums[mid] == target)){
                j = mid;
            }else{
                i = mid+1;
            }
        }
        return i;
    }

    public static void main (String[] args){
        SearchRange searchRange = new SearchRange();
        searchRange.searchRange(new int[]{5,7,7,8,8,10}, 8);
    }
}
