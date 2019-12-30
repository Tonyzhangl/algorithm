package LeetCode.LinkNote;

/**
* @Description:    反转一个单链表，https://leetcode-cn.com/problems/reverse-linked-list/
* @Author:         kirago
* @CreateDate:     2019/12/30 9:31 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class LinkReverSolution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    迭代
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            // 记录当前节点的下一节点
            ListNode temp = curr.next;
            // 然后将当前节点指向 prev
            curr.next = prev;

            // prev 向后移一位
            prev = curr;

            // curr 向后移一位
            curr = temp;
        }
        return prev;
    }

}
