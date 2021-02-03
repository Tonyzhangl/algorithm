package LeetCode.ListNote;

import org.omg.DynamicAny._DynEnumStub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @description:    18. 四数之和
* @author:         kirago
* @date:     2021/2/3 10:14 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC18 {
    public List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 4) return ans;
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-3;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<len-2;j++){
                int left=j+1,right=len-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target && !ans.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]))){
                        ans.add(Arrays.asList(nums[i], nums[j],nums[left],nums[right]));
                        while(left<right && nums[left+1]==nums[left]) left++;
                        while(left<right && nums[right-1]==nums[right]) right--;
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LC18 lc18 = new LC18();
        lc18.fourSum(new int[]{-2,-1,-1,1,1,2,2}, 0);
    }
}
