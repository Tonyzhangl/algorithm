package LeetCode.ListNote;

import java.util.HashMap;

/**
* @Description:    两数组之和，https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
* @Author:         kirago
* @CreateDate:     2019/12/17 2:25 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class LC167 {

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] list =new int[2];
        for(int i=0;i<numbers.length;i++) {
            hashMap.put(numbers[i],i+1);
            if(numbers[i] > target) {
                break;
            }
        }
        for(int i=0;i<numbers.length;i++) {
            int t = target - numbers[i];
            try {
                if(i+1 < hashMap.get(t)){
                    list[0] = i+1;
                    list[1] = hashMap.get(t);
                    break;
                }
            }catch (NullPointerException e){
                 continue;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] tmp = new int[]{5,25,75};
        int[] r = twoSum(tmp, 100);
        for(int x:r) {
            System.out.println(x);
        }

    }
}