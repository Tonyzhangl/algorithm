package LeetCode.LinkNote;
/**
* @description:    https://leetcode-cn.com/problems/add-two-numbers/
* @author:         kirago
* @date:     2021/1/19 10:31 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class TwoNumAdd {
    
    public static class ListNode{
        int val;
        ListNode next;
        ListNode (int x){
            val  = x;
        }
    } 
    
    public ListNode twoNumAdd(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int flag = 0;
        while(l1 != null || l2 != null){
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1+v2+flag;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            flag = sum/10 == 1 ? 1 : 0;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(flag == 1){
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }
}
