package LinkedLists;
import LinkedLists.LinkedList;

public class SumLists {

    public static LinkedList<Integer> solve(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        Node<Integer> node = new Node<Integer>(0, null);
        node.next = new Node<Integer>(0, null);
        node.data = solveHelper(l1.head, l2.head, node.next);
        return new LinkedList<Integer>(node);
    }

    public static int solveHelper(Node<Integer> n1, Node<Integer> n2, Node<Integer> res) {

        if (n1 == null && n2 == null) {
            return 0;
        }
        res.next = new Node<Integer>(0, null);

        if (n1 == null) {
            int sum = n2.data + solveHelper(n1, n2.next, res.next);
            res.data = sum % 10;
            return sum / 10;
        }
        if (n2 == null) {
            int sum = n1.data + solveHelper(n1.next, n2, res.next);
            res.data = sum % 10;
            return sum / 10;
        }
        int sum = n1.data + n2.data + solveHelper(n1.next, n2.next, res.next);
        res.data = sum % 10;
        return sum / 10;
    }
}

