package TreesAndGraphs;

import java.util.Objects;

public class CheckSubtree {

    public static boolean solve(BST<Integer> T1, BST<Integer> T2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        preOrderTraversal(T1.root, string1);
        preOrderTraversal(T2.root, string2);

        String str1 = string1.toString();
        String str2 = string2.toString();

        return str1.contains(str2);
    }

    public static void preOrderTraversal(Node<Integer> node, StringBuilder string) {
        if (node != null) {
            string.append(node.value);
            preOrderTraversal(node.left, string);
            preOrderTraversal(node.right, string);
        } else {
            string.append("?");
        }
    }

    public static boolean solveRecursively(BST<Integer> T1, BST<Integer> T2) {
        if (T2.root == null) {
            return true;
        }
        return solveRecursivelyHelper(T1.root, T2.root);
    }

    public static boolean solveRecursivelyHelper(Node<Integer> node, Node<Integer> root) {
        if (node == null) {
            return false;
        }
        if (node.value.equals(root.value) && checkEqual(node, root)) {
            return true;
        }
        return solveRecursivelyHelper(node.left, root) || solveRecursivelyHelper(node.right, root);
    }

    public static boolean checkEqual(Node<Integer> node, Node<Integer> root) {
        if (node == null && root == null) {
            return true;
        }

        if (node == null || root == null) {
            return false;
        }

        if (node.value != root.value) {
            return false;
        }

        return checkEqual(node.left, root.left) && checkEqual(node.right, root.right);
    }
}
