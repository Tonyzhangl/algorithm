package CodingInterview.BitNote;

/**
* @Description:    二进制中1的个数
* @Author:         kirago
* @CreateDate:     2020/2/21 5:00 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class BitNums {

    public int hanmingWight(int n){
        int mask = 1, ans=0;
        for(int i=0;i<32;i++){
            ans +=  ((n & mask<<i) !=0) ? 1 : 0;
        }
        return ans;
    }
}
