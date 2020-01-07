package LeetCode.LinkNote;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
* @Description:    环形链表，https://leetcode-cn.com/problems/linked-list-cycle/
* @Author:         kirago
* @CreateDate:     2020/1/7 10:06 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class HasCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
           val = x;
           next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if(set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }


}
