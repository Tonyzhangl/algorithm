package CodingInterview.ListNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* @Description:    两数之和，https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/submissions/
* @Author:         kirago
* @CreateDate:     2020/3/8 9:46 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int remain = target-nums[i];
            if(map.containsKey(remain) && map.get(remain) != i){
                list.add(nums[i]);
                list.add(remain);
                break;
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();

    }

    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[]{14,15,16,22,53,60}, 76);

    }
}
