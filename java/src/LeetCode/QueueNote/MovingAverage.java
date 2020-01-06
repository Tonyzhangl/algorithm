package LeetCode.QueueNote;

import java.util.LinkedList;
import java.util.Queue;

/**
* @Description:    数据流中的移动平均值,https://leetcode-cn.com/problems/moving-average-from-data-stream/
* @Author:         kirago
* @CreateDate:     2020/1/6 4:31 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MovingAverage {

    private int size = 0;
    private double sum = 0.0;
    private Queue<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        sum += val;
        queue.offer(val);
        if(queue.size() > size){
            sum -= queue.remove();
        }
        return sum / size;
    }


}
