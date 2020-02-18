package LeetCode.DPNote;


/**
* @Description:    比特位计数，https://leetcode-cn.com/problems/counting-bits/
* @Author:         kirago
* @CreateDate:     2020/2/15 5:15 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CountBits {

    // 借助位1个数统计的解法实现
    public int[] countBits1(int num){
        int[] ans = new int[num+1];
        for(int i=0;i<=num;i++){
            ans[i] = count(i);
        }
        return ans;
    }

    private int count(int n){
        int res=0;
        while(n !=0){
            res++;
            n &=n-1;
        }
        return res;
    }

    // 借用 动态规划 + 最高位的汉明距离为 1 来解决
    public int[] countBits2(int num){
        int[] ans = new int[num+1];
        int i=0,b=1;
        while(b<=num){
            while(i<b && i+b<=num){
                ans[i+b] = ans[i]+1;
                ++i;
            }
            i = 0;
            b <<=1;
        }
        return ans;
    }

    // 兼用 动态规划 + 最低有效位来解决
    public int[] countBits3(int num){
        int[] ans = new int[num+1];
        for(int i=0;i<=num;i++){
            ans[i] = ans[i>>1] + (i&1);
        }
        return ans;
    }
}
