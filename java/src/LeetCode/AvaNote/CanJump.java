package LeetCode.AvaNote;

/**
* @Description:    跳跃游戏,https://leetcode-cn.com/problems/jump-game/
* @Author:         kirago
* @CreateDate:     2020/2/19 4:17 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CanJump {

    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

    public  static void main(String[] args){
        CanJump canJump = new CanJump();
        canJump.canJump(new int[]{9, 4, 2, 1, 0, 2, 0});
    }
}
