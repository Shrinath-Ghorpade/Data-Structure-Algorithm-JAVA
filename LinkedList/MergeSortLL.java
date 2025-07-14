package LinkedList;
// Merege two sorted linked list
public class MergeSortLL {
    public static void main(String[] args) {
        MergeSortLL list = new MergeSortLL();
        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(3);

        System.out.println("Original List:");
        list.display();

        list.head = list.sortList(list.head);
        System.out.println("\nSorted List:");
        list.display();
    }

    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    ListNode head;

    public void insertLast(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Find the middle of the list
        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;  // Split the list into two halves

        // Step 2: Recursively sort each half
        left = sortList(left);
        right = sortList(right);

        // Step 3: Merge the sorted halves
        return merge(left, right);
    }

    public ListNode getMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast pointer by two steps and slow pointer by one step
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Break the list into two halves
        if (prev != null) {
            prev.next = null;
        }

        return slow;  // Return the middle node
    }

    public ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);  // Dummy node to simplify merging
        ListNode tail = dummy;

        // Merge two sorted linked lists
        while (first != null && second != null) {
            if (first.value < second.value) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes of `first` or `second`
        tail.next = (first != null) ? first : second;

        return dummy.next;  // Return the head of the merged list
    }
}
