package LeetCode.BCNote;

/**
* @Description:    位1的个数,https://leetcode-cn.com/problems/number-of-1-bits/
* @Author:         kirago
* @CreateDate:     2020/2/15 3:47 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class HammingWeightt {

    public int hammingWeight(int n){
        int ans=0,mask=1;
        for(int i=0;i<32;i++){
            // 此处的判断条件只能通过 非0 来判断，而不是通过判断 == 1 来处理，对 mask 进行左移1位就是为了对当前首位的判断，而如果是通过
            // == 1 来判断的话则是对这个比对结果进行判断。
            if((n & mask) != 0){
                ans++;
            }
            mask <<= 1;
        }
        return ans;
    }

    public int hammingWeight2(int n){
        int ans = 0;
        while(n != 0){
            ans++;
            n &= n-1;
        }
        return ans;
    }
}
