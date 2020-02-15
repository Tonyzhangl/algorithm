package LeetCode.BCNote;

/**
* @Description:    颠倒二进制位,https://leetcode-cn.com/problems/reverse-bits/
* @Author:         kirago
* @CreateDate:     2020/2/15 4:30 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ReverseBits {

    public int reverseBits(int n){
        int ans = 0;
        for(int i=0;i<32;i++){
            ans <<= 1;
            ans |= (n &1);
            n >>=1;

        }
        return ans;
    }
}
