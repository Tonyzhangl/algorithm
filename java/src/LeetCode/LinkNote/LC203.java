package LeetCode.LinkNote;
/**
* @description:    203. 移除链表元素
* @author:         kirago
* @date:     2021/2/1 11:13 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC203 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    
    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            if(cur.val == val){
                cur = cur.next;
            }else{
                pre.next = cur;
                pre = pre.next;
                cur = cur.next;
            }
        }
        pre.next = cur;
        return dummy.next;
    }
}
