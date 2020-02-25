package CodingInterview.LinkNote;

/**
* @Description:    删除链表的节点
* @Author:         kirago
* @CreateDate:     2020/2/25 4:16 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class DeleteNodeList {

    class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode deleteNodeList(ListNode head,int val){
        if(head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        if(cur.val == val) return cur.next;
        while (cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        // 此题假设的是该节点肯定在链表中
        if(cur.next == null){
            pre.next = null;
        }else{
            pre.next = cur.next;
        }
        return head;
    }

}
