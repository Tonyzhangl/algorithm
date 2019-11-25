package LeetCode;

/**
* @Description:    合并两个有序链表,https://leetcode-cn.com/problems/merge-two-sorted-lists/
* @Author:         kirago
* @CreateDate:     2019/11/24 5:46 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 **/
public class LC21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode listNode = new ListNode(0);
        ListNode iniListNode = listNode;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val) {
                iniListNode.next = l1;
                iniListNode = iniListNode.next;
                l1 = l1.next;
            }else {
                iniListNode.next = l2;
                iniListNode = iniListNode.next;
                l2 = l2.next;
            }
        }
        if(l1 == null) {
            iniListNode.next = l2;
        }else{
            iniListNode.next = l1;
        }
        return listNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


}