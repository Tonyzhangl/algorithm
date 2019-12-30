package LeetCode.DPNote;


/**
* @Description:    斐波那契数，https://leetcode-cn.com/problems/fibonacci-number/
* @Author:         kirago
* @CreateDate:     2019/12/30 2:51 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class FibonaciArray {

    public static int fib(int N) {
        if(N <=1) return N;
        int[] fl = new int[N+1];
        fl[1]=1;
        for(int i=2;i<=N;i++){
            fl[i] = fl[i-2] + fl[i-1];
        }
        return fl[N];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
