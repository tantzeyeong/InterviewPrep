package TreesAndGraphs;

import java.util.List;

public class BST<T> {
    public Node<T> root;

    public BST(Node<T> root) {
        this.root = root;
    }

    public void printing() {
        printOutHelper(this.root);
    }
    public void printOutHelper(Node<T> child) {
        if (child != null) {
            printOutHelper(child.left);
            System.out.println(child);
            printOutHelper(child.right);
        }
    }
}
