package LeetCode.ListNote;


/**
* @description:    665. 非递减数列
* @author:         kirago
* @date:     2021/2/7 10:14 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC665 {
    public boolean checkPossibility(int[] nums){
        int count = 0;
        if(nums.length<3) return true;
        for(int i=1;i<nums.length && count<2;i++){
            if(nums[i]>=nums[i-1]) continue;
            count++;
            if(i>1 && nums[i]<nums[i-2]){
                nums[i] = nums[i-1];
            }
        }
        return count<=1;
    }

    public static void main(String[] args) {
        LC665 lc665 = new LC665();
        lc665.checkPossibility(new int[]{3,4,5,4,3});
    }
}
