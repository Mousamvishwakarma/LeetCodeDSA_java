
public class Main {

    // Node definition
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Add two numbers method
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummyHead;
        int carry = 0;

        // Loop until both lists and carry are done
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next;
    }

    // Helper: Create list from array
    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper: Print list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3}; // represents 342
        int[] arr2 = {5, 6, 4}; // represents 465

        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        System.out.print("Input l1: ");
        printList(l1);
        System.out.print("Input l2: ");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Output  : ");
        printList(result); // Expected: 7 -> 0 -> 8
    }
}
