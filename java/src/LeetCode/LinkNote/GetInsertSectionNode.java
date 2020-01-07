package LeetCode.LinkNote;

/**
* @Description:    相交链表，https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
* @Author:         kirago
* @CreateDate:     2020/1/7 10:31 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class GetInsertSectionNode {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getInsertionNode(ListNode headA, ListNode headB) {
        if( headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
