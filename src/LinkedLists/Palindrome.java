package LinkedLists;

import java.util.Deque;

public class Palindrome {

    public static boolean solve(LinkedList<Character> linkedList) {
        // Create a dequeue
        Deque<Character> deque = new java.util.LinkedList<>();
        // Iterate through the linkedList and add elements into the dequeue
        Node<Character> head = linkedList.head;
        while (head != null) {
            deque.add(head.data);
            head = head.next;
        }
        // Check that the first and last elements are equal while size of dequeue is more than 1
        while (deque.size() > 1) {
            Character c1 = deque.removeFirst();
            Character c2 = deque.removeLast();
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    // Time Complexity; O(n)
    // Space Complexity: O(n)
}
