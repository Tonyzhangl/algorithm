package LeetCode.StackNote;

public class MyStackTest {
    public static void main(String[] args){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        myStack.empty();
    }
}
