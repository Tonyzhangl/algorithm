package CodingInterview.LinkNote;

/**
* @Description:    链表中倒数第k个节点,https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
* @Author:         kirago
* @CreateDate:     2020/2/25 5:26 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class GetKthFromEnd {

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int x){
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k){
        ListNode kNode = head;
        ListNode node = head;
        int count=0;
        while(kNode != null){
            while(count < k) {
                kNode = kNode.next;
                count++;
            }
            if(kNode == null) return head;
            kNode = kNode.next;
            node = node.next;
        }
        if(count < k) return  null;
        return node;
    }

}
