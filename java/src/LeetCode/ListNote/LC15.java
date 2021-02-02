package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @description:    15. 三数之和
* @author:         kirago
* @date:     2021/1/27 2:20 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if(len < 3) return ans;
        for(int i=0;i<len;i++){
            if(nums[i]>0) return ans;
            if(i>0 && nums[i-1] == nums[i]) continue;
            int left=i+1,right=len-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left]==nums[left+1]) left++;
                    while (left<right && nums[right-1]==nums[right]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
