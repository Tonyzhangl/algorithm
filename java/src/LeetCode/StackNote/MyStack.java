package LeetCode.StackNote;

import java.util.LinkedList;
import java.util.Queue;

/**
* @Description:    队列实现栈，https://leetcode-cn.com/problems/implement-stack-using-queues/
* @Author:         kirago
* @CreateDate:     2019/12/23 11:39 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

class MyStack {

    private Queue<Integer> a;
    private Queue<Integer> b;

    /** Initialize your data structure here. */
    public MyStack() {

        a = new LinkedList<>();
        b = new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        a.offer(x);
        while (!b.isEmpty()){
            a.offer(b.poll());
        }
        Queue tmp = a;
        a = b;
        b = tmp;

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return b.poll();
    }

    /** Get the top element. */
    public int top() {

        return b.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return b.isEmpty();

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
