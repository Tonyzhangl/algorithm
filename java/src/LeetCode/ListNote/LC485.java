package LeetCode.ListNote;

/**
* @description:    485. 最大连续 1 的个数
* @author:         kirago
* @date:     2021/2/19 11:57 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, ans = 0;
        for(int num:nums){
            if(num==1) {
                ans++;
            }else{
                max = Math.max(ans, max);
                ans = 0;
            }
        }
        return Math.max(ans, max);
    }
}
