package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @Description:    两个数组的交集II，https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
* @Author:         kirago
* @CreateDate:     2020/2/27 11:49 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Intersect {

    public int[] intersect(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i1=0,i2=0;
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] == nums2[i2]){
                list.add(nums1[i1]);
                i1++;
                i2++;
            }else if(nums1[i1] < nums2[i2]){
                i1++;
            }else {
                i2++;
            }
        }

        // ArrayList<Integer> 转 int[] 数组
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
