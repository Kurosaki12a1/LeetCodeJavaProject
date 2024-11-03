
import java.lang.classfile.components.ClassPrinter;


public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        this.val = values[0];
        ListNode current = this;

        for (int i = 1; i < values.length ;  i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
