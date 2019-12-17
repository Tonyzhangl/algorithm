package LeetCode;
/**
* @Description:    删除排序链表中的重复元素, https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
* @Author:         kirago
* @CreateDate:     2019/11/30 5:53 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC83 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null &&  current.next != null) {
            if(current.next.val == current.val) {
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }
}


