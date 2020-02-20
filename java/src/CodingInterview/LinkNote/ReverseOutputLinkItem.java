package CodingInterview.LinkNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @Description:    逆序输出链表元素
 * 原始输入为 a.1->b.2->c.3
 * 要求输出为 [3,2,1]
 * 方法一： 可以通过递归
 * 方法二： 利用栈的特性（先进后出）
* @Author:         kirago
* @CreateDate:     2020/2/20 10:20 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ReverseOutputLinkItem {

    private List<Integer> ans = new ArrayList<>();

    class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
        }
    }

    // 方法一： 递归实现

    public List<Integer> reverseOutPutLinkItem(Node root){
        recusion(root, ans);
        return ans;

    }

    private void recusion(Node root, List<Integer> list){
        if( root == null){
            return;
        }
        recusion(root.next, list);
        list.add(root.val);
    }

    // 方法二：利用栈实现

    public List<Integer> reverseOutPutLinkItem1(Node root){
        Stack<Integer> stack = new Stack<>();
        while (root != null){
            stack.push(root.val);
            root = root.next;
        }
        while( !stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }

}
