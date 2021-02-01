package LeetCode.ListNote;
/**
* @description:    27. 移除元素
* @author:         kirago
* @date:     2021/2/1 11:04 上午
* @updateRemark:   修改内容
* @version:        1.0
*/

public class LC27 {
    public int removeElement(int[] nums, int val){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
