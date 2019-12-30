package LeetCode.StackNote;

/**
 * 设计一个支持 push，pop，top 操作，并能在 [常数时间内] 检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 */

import java.util.Stack;

/**
* @Description:    最小栈，https://leetcode-cn.com/explore/learn/card/queue-stack/218/stack-last-in-first-out-data-structure/877/
* @Author:         kirago
* @CreateDate:     2019/12/24 5:55 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
class MinStack {

    private Stack<Integer> stackRepo = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stackRepo.push(x);
        if(minStack.isEmpty() || x <= stackRepo.peek()) minStack.push(x);
    }

    public void pop() {
        int item = stackRepo.pop();
        if(minStack.peek() == item) minStack.pop();
    }

    public int top() {
        return stackRepo.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
