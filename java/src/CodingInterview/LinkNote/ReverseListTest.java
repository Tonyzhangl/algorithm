package CodingInterview.LinkNote;


public class ReverseListTest {

    public static void main(String[] args){
        ReverseList reverseList = new ReverseList();
        ReverseList.ListNode head = reverseList.new ListNode(1);
        ReverseList.ListNode node1 = reverseList.new ListNode(2);
        ReverseList.ListNode node2 = reverseList.new ListNode(3);
        head.next = node1;
        node1.next = node2;
        reverseList.reverseList(head);
    }
}
