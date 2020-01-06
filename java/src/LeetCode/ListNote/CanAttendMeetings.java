package LeetCode.ListNote;

import java.util.Arrays;
import java.util.Comparator;

/**
* @Description:    会议室,https://leetcode-cn.com/problems/meeting-rooms/
* @Author:         kirago
* @CreateDate:     2020/1/6 5:41 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CanAttendMeetings implements Comparator<int[]> {

    public boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals, this);
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }

    public int compare(int[] v1, int[] v2){
        return v1[0] - v2[0];
    }

}
