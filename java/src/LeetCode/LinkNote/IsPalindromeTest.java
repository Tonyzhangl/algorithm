package LeetCode.LinkNote;

public class IsPalindromeTest {

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        IsPalindrome.ListNode listNode1 = isPalindrome.new ListNode(1);
        IsPalindrome.ListNode listNode2 = isPalindrome.new ListNode(0);
        IsPalindrome.ListNode listNode3 = isPalindrome.new ListNode(1);
//        IsPalindrome.ListNode listNode4 = isPalindrome.new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode4;
        isPalindrome.isPalindRome(listNode1);
    }
}
