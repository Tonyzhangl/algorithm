package CodingInterview.LinkNote;

/**
* @Description:    调整数组顺序使奇数位于偶数前面,https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
* @Author:         kirago
* @CreateDate:     2020/2/25 4:48 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Exchange {

    public int[] exchange(int[] nums){
        int startIndex=0,endIndex=nums.length;
        while(startIndex < endIndex){
            while(nums[startIndex] % 2 == 1 && startIndex < endIndex){
                startIndex++;
            }
            while(nums[endIndex] % 2 == 0 && startIndex < endIndex){
                endIndex--;
            }
            int tmp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = tmp;
        }
        return nums;
    }
}
