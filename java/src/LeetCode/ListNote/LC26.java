package LeetCode.ListNote;

/**
* @description:    26. 删除排序数组中的重复项
* @author:         kirago
* @date:     2021/2/1 10:36 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC26 {
    public int removeDuplicates(int[] nums){
        if(nums.length<=1) return nums.length;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
