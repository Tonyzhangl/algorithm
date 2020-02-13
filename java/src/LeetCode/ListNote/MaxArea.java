package LeetCode.ListNote;

/**
* @Description:    盛水最多的容器，https://leetcode-cn.com/problems/container-with-most-water/
* @Author:         kirago
* @CreateDate:     2020/2/13 3:47 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class MaxArea {

    public int maxArea(int[] height) {
        int mArea = Integer.MIN_VALUE,start=0,end=height.length-1;
        while (start <= end) {
            int minHeight = Math.min(height[start], height[end]);
            mArea = Math.max((end - start)*minHeight, mArea);
            if(height[start] < height[end]){
                start++;
            }else {
                end--;
            }
        }
        return mArea;
    }
}
