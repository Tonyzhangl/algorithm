package LeetCode.ListNote;
/**
* @description:    1004. 最大连续1的个数 III
* @author:         kirago
* @date:     2021/2/19 11:19 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC1004 {
    public int longestOnes(int[] A, int K) {
        int zeroNums = 0,max = 0;
        int left = 0, right = 0, len = A.length;
        while(right<len){
            if(A[right] == 1) {
                right++;
            }else if(A[right] == 0 && max <= K){
                zeroNums++;
                right++;
            }else{
                if(A[left]==0){
                    zeroNums--;
                    left++;
                }else{
                    left++;
                }
                max = Math.max(right-left+1, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LC1004 lc1004 = new LC1004();
        lc1004.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);
    }
}
