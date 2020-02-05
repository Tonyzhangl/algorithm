package LeetCode.RecallNote;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* @Description:    回溯算法示例，全排列，https://www.cxyxiaowu.com/7103.html
* @Author:         kirago
* @CreateDate:     2020/2/4 10:05 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class RecallExample {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        backtrack(nums, linkedList);
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> linkedList){
        if(linkedList.size() == nums.length) {
            res.add(linkedList);
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(linkedList.contains(nums[i])){
                continue;
            }
            linkedList.add(nums[i]);
            backtrack(nums, linkedList);
            linkedList.removeLast();
        }
    }


}
