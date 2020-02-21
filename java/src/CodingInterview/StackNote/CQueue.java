package CodingInterview.StackNote;

import java.util.Stack;

/**
* @Description:    两个栈实现队列,https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
* @Author:         kirago
* @CreateDate:     2020/2/21 10:17 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CQueue {

    private Stack<Integer> stack1 ;
    private Stack<Integer> stack2 ;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }

    public int deleteHead() {
        if( stack1.isEmpty()){
            return -1;
        }
        return stack1.pop();
    }
}
