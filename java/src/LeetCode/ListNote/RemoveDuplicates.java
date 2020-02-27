package LeetCode.ListNote;

/**
* @Description:    从排序数组中删除重复项,https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/1/array/21/
* @Author:         kirago
* @CreateDate:     2020/2/27 2:48 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int mark = nums[0], index = 1, len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] != mark) {
                nums[index]=nums[i];
                index++;
                mark = nums[i];
            }
        }
        return index == 0 ? len : index;
    }

    public static void main(String[] args){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(new int[]{});
    }
}
