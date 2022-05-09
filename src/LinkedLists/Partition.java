package LinkedLists;

import java.util.Queue;

public class Partition {

    public static LinkedList<Integer> solve(LinkedList<Integer> linkedList, int pivot) {
        if (linkedList.head == null) {
            return linkedList;
        }
        // Create an empty queue
        Queue<Node<Integer>> queue = new java.util.LinkedList<>();
        // Iterate through the linked list
        Node<Integer> head = linkedList.head;
        while (head != null) {
            // If queue is not empty and the value is smaller than the pivot, swap the value with
            // the first element in the queue, then dequeue the first element and enqueue it back into the queue.
            if (queue.size() != 0 && head.data < pivot) {
                int temp = head.data;
                Node<Integer> firstElement = queue.poll();
                head.data = firstElement.data;
                firstElement.data = temp;
                queue.add(head);
            }
            // Else if value is larger than or equals to pivot, enqueue the value
            else if (head.data >= pivot) {
                queue.add(head);
            }
            head = head.next;
        }
        // Return linked list
        return linkedList;

        // Time Complexity: O(n)
        // Space Complexity: O(n)
    }
}
