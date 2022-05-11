import ArraysAndStrings.*;
import LinkedLists.*;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix3 = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        int[][] matrix4 = {
                {1, 1, 1, 0},
                {1, 4, 5, 1},
        };
        Node<Integer> node3 = new Node<>(3, null);
        Node<Integer> node2 = new Node<>(2, node3);
        Node<Integer> node1 = new Node<>(1, node2);
        Node<Integer> node10 = new Node<>(10, null);
        Node<Integer> node9 = new Node<>(9, node10);
        Node<Integer> node8 = new Node<>(8, node9);
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>(node1);
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>(node2);
        LinkedList<Integer> linkedList3 = new LinkedList<Integer>(node8);
        System.out.println(Intersection.solve(linkedList1, linkedList2) == node2);
        System.out.println(Intersection.solve(linkedList1, linkedList3) == null);
    }
}
