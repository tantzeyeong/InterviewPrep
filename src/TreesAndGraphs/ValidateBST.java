package TreesAndGraphs;

import LinkedLists.Palindrome;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST {

    public static boolean solve(BST<Integer> bst) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.MIN_VALUE);
        solveHelper(bst.root, list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        if (list.get(0) == 0) {
            return false;
        }
        return true;
    }
    public static void solveHelper(Node<Integer> node, List<Integer> list) {
        if (node != null) {
            solveHelper(node.left, list);
            if (list.get(list.size() - 1) > node.value) {
                list.set(0, 0);
            }
            list.add(node.value);
            solveHelper(node.right, list);
        }
    }
}
