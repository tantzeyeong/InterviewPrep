package TreesAndGraphs;

import java.sql.SQLOutput;
import java.util.List;

public class MinimalTree {

    public static <T> BST<T> solve(List<T> list) {
        return new BST<>(solveHelper(list, 0, list.size() - 1));
    }

    public static <T> Node<T> solveHelper(List<T> list, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        Node<T> node = new Node<>(list.get(mid));
        node.left = solveHelper(list, left, mid - 1);
        node.right = solveHelper(list, mid + 1, right);
        return node;
    }
//    public void solve(List<T> list) {
//        int rootIndex = (list.size()) / 2;
//        Node<T> root = new Node(list.get(rootIndex));
//        BST<T> bst = new BST<>(new Node(root));
//        this.bst = bst;
//        solveHelper(list, root, 0, rootIndex - 1, "left");
//        solveHelper(list, root,rootIndex + 1, list.size() - 1, "right");
//    }
//
//    public void solveHelper(List<T> list, Node<T> parent, int left, int right, String child) {
//        Node<T> node;
//        if (left >= right)  {
//            if (child == "left") {
//                node = new Node(list.get(left));
//                parent.left = node;
//            } else {
//                node = new Node(list.get(right));
//                parent.right = node;
//            }
//        } else {
//            int mid = (left + right) / 2;
//            if (child == "left") {
//                node = new Node(list.get(mid));
//                parent.left = node;
//            } else {
//                node = new Node(list.get(mid));
//                parent.right = node;
//            }
//            solveHelper(list, node, left, mid - 1, "left");
//            solveHelper(list, node, mid + 1, right, "right");
//        }
//    }

//    public void printing() {
//        if (this.bst.root.left != null) {
//            printOutHelper(this.bst.root.left);
//        }
//        System.out.println(this.bst.root.value);
//        if (this.bst.root.right != null) {
//            printOutHelper(this.bst.root.right);
//        }
//    }


}
