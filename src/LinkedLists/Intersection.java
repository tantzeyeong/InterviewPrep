package LinkedLists;

public class Intersection {

    public static <T> Node<T> solve(LinkedList<T> l1, LinkedList<T> l2) {

        int size1 = findLength(l1);
        int size2 = findLength(l2);

        Node<T> n1 = l1.head;
        Node<T> n2 = l2.head;

        int count;
        if (size2 < size1) {
            count = size1 - size2;
            while (count != 0) {
                n1 = n1.next;
                count -= 1;
            }
        } else {
            count = size2 - size1;
            while (count != 0) {
                n2 = n2.next;
                count -= 1;
            }
        }

        while (n1 != null) {
            if (n1 == n2) {
                return n1;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        // At the end of iterating through, return null
        return null;
    }
    // Time Complexity: O(l1 + l2)
    // Space Complexity: O(1)

    public static <T> int findLength(LinkedList<T> linkedList) {
        // Keep track of first node of each linked list
        Node<T> n1 = linkedList.head;

        int size = 0;
        // Iterate through the linked lists and check if any nodes have the same reference as the first nodes
        // Return the node if similar
        while (n1 != null) {
            size += 1;
            n1 = n1.next;
        }
        return size;
    }
}
