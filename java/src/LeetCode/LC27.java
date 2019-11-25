package LeetCode;

/**
* @Description:    删除数组中给定元素,https://leetcode-cn.com/problems/remove-element/
* @Author:         kirago
* @CreateDate:     2019/11/25 11:27 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC27 {

    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++) {
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}