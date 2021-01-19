package LeetCode.MapNote;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
* @description:    https://leetcode-cn.com/problems/two-sum/
* @author:         kirago
* @date:     2021/1/19 10:19 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class TwoNumSum {
    public int[] twoSum(int[] nums,int target){
        List<Integer> list = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) &&  map.get(target-nums[i])!=i){
                list.add(i);
                list.add(map.get(target-nums[i]));
                break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
