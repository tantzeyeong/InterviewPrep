package LinkedLists;

public class Intersection {

    public static <T> Node<T> solve(LinkedList<T> l1, LinkedList<T> l2) {
        // Keep track of first node of each linked list
        Node<T> n1 = l1.head;
        Node<T> n2 = l2.head;

        Node<T> h1 = n1.next;
        Node<T> h2 = n2.next;
        // Iterate through the linked lists and check if any nodes have the same reference as the first nodes
        // Return the node if similar
        while (h1 != null) {
            if (h1 == n1 || h1 == n2) {
                return h1;
            }
            h1 = h1.next;
        }
        while (h2 != null) {
            if (h2 == n1 && h2 == n2) {
                return h2;
            }
            h2 = h2.next;
        }
        // At the end of iterating through, return null
        return null;
    }
    // Time Complexity: O(l1 + l2)
    // Space Complexity: O(1)
}
