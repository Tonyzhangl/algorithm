package LeetCode.ListNote;

import java.util.Arrays;

/**
* @Description:    救生艇，https://leetcode-cn.com/problems/boats-to-save-people/
* @Author:         kirago
* @CreateDate:     2020/2/26 4:49 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class NumRescueBoats {

    public int numRescueBoats(int[] people, int limit){
        Arrays.sort(people);
        int leftIndex=0,rightIndex=people.length-1,ans=0;
        while(leftIndex < rightIndex){
            if(people[rightIndex] == limit){
                ans++;
                rightIndex--;
            }else if(people[rightIndex] + people[leftIndex] <= limit){
                ans++;
                rightIndex--;
                leftIndex++;
            }else if(people[rightIndex] + people[leftIndex] > limit){
                ans++;
                rightIndex--;
            }
        }
        if(leftIndex==rightIndex) ans++;
        return ans;
    }
}
