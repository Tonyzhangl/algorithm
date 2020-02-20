package CodingInterview.LinkNote;

public class ReverseOutputLinkItemTest {

    public static void main(String[] args){
        ReverseOutputLinkItem reverseOutputLinkItem= new ReverseOutputLinkItem();
        ReverseOutputLinkItem.Node node = reverseOutputLinkItem.new Node(1);
        ReverseOutputLinkItem.Node node1 = reverseOutputLinkItem.new Node(2);
        ReverseOutputLinkItem.Node node2 = reverseOutputLinkItem.new Node(3);
        node.next = node1;
        node1.next = node2;
        reverseOutputLinkItem.reverseOutPutLinkItem(node);
        reverseOutputLinkItem.reverseOutPutLinkItem1(node);
    }


}
