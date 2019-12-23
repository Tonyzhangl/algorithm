package LeetCode.QueueNote;


import java.util.Stack;

/**
* @Description:    栈实现队列，https://leetcode-cn.com/problems/implement-queue-using-stacks/
* @Author:         kirago
* @CreateDate:     2019/12/23 10:43 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MyQueue{

    private Stack<Integer> preStack;
    private Stack<Integer> afStack;

    /** Initialize your data structure here. */
    public MyQueue() {

        preStack = new Stack<>();
        afStack = new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        preStack.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(afStack.isEmpty()){
            while (!preStack.isEmpty()) {
                afStack.push(preStack.pop());
            }
        }
        return afStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(afStack.isEmpty()){
            while (!preStack.isEmpty()) {
                afStack.push(preStack.pop());
            }
        }
        return afStack.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

        return preStack.isEmpty() && afStack.isEmpty();

    }
}
