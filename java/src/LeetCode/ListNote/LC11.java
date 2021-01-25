package LeetCode.ListNote;
/**
* @description:    11. 盛最多水的容器
* @author:         kirago
* @date:     2021/1/25 2:18 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC11 {
    public int maxArea(int[] height){
        int left=0,right=height.length-1;
        int max = Math.min(height[left], height[right])*(right-left);
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            max = Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
