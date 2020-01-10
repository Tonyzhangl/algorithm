package LeetCode.LinkNote;

/**
* @Description:    删除链表节点,https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
* @Author:         kirago
* @CreateDate:     2020/1/10 2:17 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class DeleteNode {

    public class LinkNode{
        int val;
        LinkNode next;
        LinkNode(int x) {
            val = x;
        }
    }

    public void deleteNode(LinkNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
