package LeetCode.ListNote;


/**
* @description:    1128. 等价多米诺骨牌对的数量
* @author:         kirago
* @date:     2021/1/26 2:45 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC1128 {
    public int numEquivDominoPairs(int[][] dominoes){
        int[] nums = new int[200];
        int count = 0;
        for(int[] dominoe:dominoes){
            int val = (dominoe[0]+dominoe[1])*10+Math.abs(dominoe[0]-dominoe[1]);
            count += nums[val];
            nums[val]++;
        }
        return count;
    }
}
