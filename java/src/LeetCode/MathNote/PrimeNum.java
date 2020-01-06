package LeetCode.MathNote;

import java.util.Arrays;

/**
* @Description:    计数质数,https://leetcode-cn.com/problems/count-primes/
* @Author:         kirago
* @CreateDate:     2020/1/6 9:22 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class PrimeNum {

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for(int i=2;i*i<n;i++) {
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++) {
            if(isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
       System.out.println(countPrimes(10));
    }
}
