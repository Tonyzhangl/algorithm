package CodingInterview.RecursionNote;

/**
* @Description:    利用递归求和 1+2+3+4+...+n，不用for循环
* @Author:         kirago
* @CreateDate:     2020/2/21 3:40 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class RecursionDemo {

    int ans=0;

    public int recursionDemo(int n){
        if(n ==0 ){
            return 0;
        }
        ans += n + recursionDemo(n-1);
        return ans;

    }

    public static void main(String[] args){
        RecursionDemo rd = new RecursionDemo();

        rd.recursionDemo(5);

    }
}
