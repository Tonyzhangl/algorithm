package LeetCode;

/**
* @Description:    删除排序数组中的重复项,https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
* @Author:         kirago
* @CreateDate:     2019/11/25 10:45 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <=1){
            return nums.length;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}