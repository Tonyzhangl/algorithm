package LeetCode.ListNote;

import java.util.Arrays;
import java.util.LinkedList;

/**
* @Description:    摆动排序,https://leetcode-cn.com/problems/wiggle-sort/
* @Author:         kirago
* @CreateDate:     2020/4/22 3:39 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class WiggleSort {
    public void wiggleSort1(int[] nums) {
        Arrays.sort(nums);
        boolean flag = true;
        LinkedList<Integer> list = new LinkedList();
        for(int num:nums){
            list.add(num);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = flag ? list.removeFirst() : list.removeLast();
            flag = !flag;
        }
    }

    public void wiggleSort2(int[] nums){
        boolean flag  = true;
        for(int i=0;i<nums.length-1;i++){
            if(flag){
                if(nums[i] > nums[i+1])
                    swap(nums,i,i+1);
            }else{
                if(nums[i] < nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
            flag = !flag;
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
