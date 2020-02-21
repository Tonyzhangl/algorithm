package CodingInterview.RecursionNote;

/**
* @Description:    斐波那次递归代码优化,利用迭代记录之前的记录
* @Author:         kirago
* @CreateDate:     2020/2/21 4:09 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Fibonacci {

    public int fibonacci(int n){
        int ans =0;
        if(n<2) return n;
        int fn1 = fibonacci(0),fn2 = fibonacci(1);
        for(int i=2;i<=n;i++){
            ans = fn1+ fn2;
            fn1 = fn2;
            fn2 = ans;

        }
        return ans;
    }

    public static void main(String[] args){
        Fibonacci fb = new Fibonacci();
        System.out.println(fb.fibonacci(4));
    }
}
