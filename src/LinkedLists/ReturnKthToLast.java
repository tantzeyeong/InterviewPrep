package LinkedLists;
import LinkedLists.LinkedList;

public class ReturnKthToLast {

    public static <T> LinkedList<T> solve(LinkedList<T> linkedList, int k) {
        Node<T> head = linkedList.head;
        for (int i = 0; i < k; i++) {
            head = head.next;
        }
        return new LinkedList<T>(head);
    }
}
