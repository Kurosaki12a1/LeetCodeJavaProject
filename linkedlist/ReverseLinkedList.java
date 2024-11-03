
public class ReverseLinkedList {

    // Time: O(n)
    // Space: O(1)
    public static void main(String[] args) {
        ListNode head = new ListNode(new int[] {1,2,3,4,5});
        System.out.println("Before: "  + head);
        ListNode result = reverseList(head);
        System.out.print("After: " + result);
    } 

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next; // Store next node
            current.next = prev; // Reverse node
            prev = current;
            current = next;
        }

        return prev;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Recursive Solution from next node;
        ListNode newHead = reverseList2(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
