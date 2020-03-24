package LeetCode.ListNote;

import LeetCode.ListNode;

/**
* @Description:    K个一维数组翻转，https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
* @Author:         kirago
* @CreateDate:     2020/3/24 5:19 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class RerveseKGroup {

    public ListNode reverseKGroup(ListNode head, int k){
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode end = preHead;

        while(end.next != null){
            for(int i=0;i<k&& end != null ;i++) end = end.next;
            if(end == null) break;
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);

            start.next = next;
            pre = start;
            end = pre;
        }
        return preHead.next;

    }

    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
