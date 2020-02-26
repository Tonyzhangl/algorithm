package CodingInterview.LinkNote;

/**
* @Description:    反转链表,https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
* @Author:         kirago
* @CreateDate:     2020/2/25 5:37 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ReverseList {

    class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur=cur.next;
        }
        return pre;
    }
}
