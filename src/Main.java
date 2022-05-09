import ArraysAndStrings.*;
import LinkedLists.LinkedList;
import LinkedLists.Partition;
import LinkedLists.ReturnKthToLast;
import LinkedLists.SumLists;

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

        Integer[] arr1 = {9, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        LinkedList<Integer> linkedList = new LinkedList<>(arr1);
        LinkedList<Integer> linkedList2 = new LinkedList<>(arr2);
        System.out.println(linkedList);
        System.out.println(linkedList2);
        System.out.println(SumLists.solve(linkedList, linkedList2));
    }
}
