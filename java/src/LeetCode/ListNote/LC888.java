package LeetCode.ListNote;

import java.util.Arrays;

/**
* @description:    888. 公平的糖果棒交换
* @author:         kirago
* @date:     2021/2/1 9:51 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC888 {
    public int[] fairCandySwap(int[] A,int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int i=0,j=0;
        while(i<A.length && j<B.length){
            int x=sumA-A[i]+B[j],y=sumB-B[j]+A[i];
            if(x==y){
                return new int[]{A[i],B[j]};
            }else if(x>y){
                i++;
            }else{
                j++;
            }
        }
        return new int[2];
    }
}
