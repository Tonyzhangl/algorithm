package LeetCode.ListNote;


import java.util.*;

/**
* @Description:    三数之和，https://leetcode-cn.com/problems/3sum/
* @Author:         kirago
* @CreateDate:     2020/1/17 10:39 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ThreeSum {

    /** 暴力遍历,这种方法太辣鸡
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> treeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> numsList = new ArrayList<>();
        for(int num:nums) {
            numsList.add(num);
        }
        Collections.sort(numsList);
        int size = numsList.size();
        if(numsList.size() <= 2) return ans;
        if (numsList.size() == 3) {
            if(numsList.get(0) + numsList.get(1) + numsList.get(2) == 0){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(numsList.get(0));
                tmp.add(numsList.get(1));
                tmp.add(numsList.get(2));
                ans.add(tmp);
            }else {
                return ans;
            }
        }else {
        for(int i=0;i<size-2;i++){
            if(numsList.get(i) > 0) return ans;
            for(int j=i+1;j<size-1;j++){
                if(numsList.get(j) > 0 - numsList.get(i))  break;
                for(int k=j+1;k<size;k++){
                    if(numsList.get(k)> 0 - numsList.get(i)-numsList.get(j)) break;
                    if(numsList.get(i) + numsList.get(j) + numsList.get(k) == 0){
                        List<Integer> item = new ArrayList<>();
                        item.add(numsList.get(i));
                        item.add(numsList.get(j));
                        item.add(numsList.get(k));
                        if(!ans.contains(item)) {
                            ans.add(item);
                        }
                    }

                }
            }
        }
        }
        return ans;
    }

    /** 双指针遍历
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> treeSum1(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int sum=0,len=nums.length;
        if(len < 3 || nums == null ) return ans;
        for(int i=0;i<len;i++) {
            if(nums[i] > 0) return ans;
            if(i>0 && nums[i-1] == nums[i]) continue;
            int left = i+1,right=len-1;
            while(left<right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else if(sum > 0) {
                    right--;
                }
            }
        }
        return ans;
    }
}
