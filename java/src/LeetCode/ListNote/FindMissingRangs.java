package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    缺失的区间,https://leetcode-cn.com/problems/missing-ranges/
* @Author:         kirago
* @CreateDate:     2020/3/24 11:05 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class FindMissingRangs {

    public List<String> findMissingRanges(int[] nums,int lower,int upper){
        List<String> ans = new ArrayList<>();
        long pre = (long)lower-1;
        for(int item:nums){
            if(item - pre == 2) ans.add(String.valueOf(pre+1));
            else if(item - pre > 2) ans.add(String.valueOf(pre+1) + "->" + String.valueOf(item-1));
            pre = item;
        }
        if(upper - pre == 1) ans.add(String.valueOf(pre+1));
        else if(upper - pre >1) ans.add(String.valueOf(pre+1) + "->" + String.valueOf(upper));
        return  ans;
    }
}
