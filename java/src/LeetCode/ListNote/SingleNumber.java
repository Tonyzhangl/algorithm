package LeetCode.ListNote;

/**
* @Description:    只出现一次的数,https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
* @Author:         kirago
* @CreateDate:     2020/2/27 11:16 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class SingleNumber {

    /**利用异或运算符具备交换律及结合律
     *
     * @param nums int[]
     * @return int
     */
    public int singleNumber(int[] nums){
        int num=0;
        for(int item:nums){
            num = num^item;
        }
        return num;
    }

    public static void main(String[] args){
        SingleNumber singleNumber = new SingleNumber();
        singleNumber.singleNumber(new int[]{2,2,1,3,1,4,3});
    }
}
