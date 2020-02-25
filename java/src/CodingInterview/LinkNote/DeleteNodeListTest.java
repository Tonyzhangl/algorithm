package CodingInterview.LinkNote;

public class DeleteNodeListTest {
    public static void main(String[] args){
        DeleteNodeList demo = new DeleteNodeList();
        DeleteNodeList.ListNode head = demo.new ListNode(1);
        DeleteNodeList.ListNode node1 = demo.new ListNode(2);
        DeleteNodeList.ListNode node2 = demo.new ListNode(3);
        head.next = node1;
        node1.next = node2;
        demo.deleteNodeList(head, 4);
    }
}
