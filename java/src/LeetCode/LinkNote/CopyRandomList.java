package LeetCode.LinkNote;

import java.util.HashMap;

/**
* @Description:    复制到随机指针的链表，https://leetcode-cn.com/problems/copy-list-with-random-pointer/
* @Author:         kirago
* @CreateDate:     2020/2/5 3:43 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CopyRandomList {

    HashMap<Node, Node> visitedNode = new HashMap<>();

    class Node{
        int val;
        Node next;
        Node random;

        public Node(int x, Node next, Node random){
            this.val = x;
            this.next = null;
            this.random = null;

        }
    }

    public Node copyRandomList(Node head) {


        if (head==null) {
            return null;
        }

        if(visitedNode.containsKey(head)) {
            return visitedNode.get(head);
        }

        Node node = new Node(head.val, null, null);

        visitedNode.put(head, node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;
    }

}
