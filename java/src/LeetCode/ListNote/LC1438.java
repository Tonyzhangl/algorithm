package LeetCode.ListNote;

import java.util.TreeMap;

/**
* @description:    1438. 绝对差不超过限制的最长连续子数组
* @author:         kirago
* @date:     2021/2/22 9:15 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC1438 {
    public int longestSubArray(int[] nums,int limit){
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
        int len = nums.length,left = 0, right = 0;
        int res = 0;
        while(right<len){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.lastKey()-map.firstKey() > limit){
                map.put(nums[left], map.get(nums[left])-1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        LC1438 lc1438  = new LC1438();
        lc1438.longestSubArray(new int[]{8,2,4,7},4);
    }
}
