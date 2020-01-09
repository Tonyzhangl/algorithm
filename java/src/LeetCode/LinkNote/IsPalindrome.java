package LeetCode.LinkNote;

/**
* @Description:    回文链表，https://leetcode-cn.com/problems/palindrome-linked-list/
* @Author:         kirago
* @CreateDate:     2020/1/8 7:57 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IsPalindrome {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindRome(ListNode root) {
        ListNode fast = root, slow = root, pre=root , prepre=null;
        //链表为空链表
        if(root == null || root.next == null) return true;

        //链表长度为2 边界处理
        if(root.next.next == null) {
            return root.val == root.next.val ;
        }

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
            pre.next = prepre;
//            prepre = slow;
            prepre = pre;

        }
        if(fast != null) slow = slow.next;
        while ( slow != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;

        }
        return true;
    }
}
