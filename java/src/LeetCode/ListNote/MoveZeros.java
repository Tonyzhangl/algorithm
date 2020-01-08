package LeetCode.ListNote;

/**
* @Description:    移动零,https://leetcode-cn.com/problems/move-zeroes/
* @Author:         kirago
* @CreateDate:     2020/1/8 5:10 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MoveZeros {

    public void moveZeros(int[] nums) {
        int index=0;
        for(int num:nums) {
            if( num != 0 ) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
