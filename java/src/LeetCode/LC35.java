package LeetCode;

/**
* @Description:    搜索插入位置，https://leetcode-cn.com/problems/search-insert-position/
* @Author:         kirago
* @CreateDate:     2019/11/25 4:54 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length ==0) {
            return 0;
        }
        int r = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] >= target) {
                r = i;
                break;
            }else if(i==nums.length-1){
                r =  nums.length;
                break;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
}