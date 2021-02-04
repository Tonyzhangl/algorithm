package LeetCode.ListNote;

/**
* @description:    643. 子数组最大平均数 I
* @author:         kirago
* @date:     2021/2/4 10:21 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC643 {
    public double findMaxAverage(int[] nums,int k){
        double ans = Double.NEGATIVE_INFINITY;
        double sum = 0;
        int len = nums.length;
        int left = 0,right=0;
        if(len>=k){
            while(right<len){
                while(right<k){
                    sum += nums[right++];
                }
                ans = Math.max(ans, sum/k);
                if(right>=k && right<len){
                    sum -= nums[left++];
                    sum += nums[right++];
                }
            }
        }
        ans = Math.max(ans, sum/k);
        return ans;
    }

    public static void main(String[] args) {
        LC643 lc643 = new LC643();
        lc643.findMaxAverage(new int[]{0,1,1,3,3}, 4);
    }
}
