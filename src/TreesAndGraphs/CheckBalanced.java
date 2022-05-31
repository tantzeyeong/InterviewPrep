package TreesAndGraphs;

public class CheckBalanced<T> {

    public static <T> boolean solve(BST<T> bst) {
        int leftHeight = findHeight(bst.root.left);
        int rightHeight = findHeight(bst.root.right);
        return Math.abs(leftHeight - rightHeight) < 2;
    }

    public static <T> int findHeight(Node<T> node) {
        if (node == null) {
            return -1;
        }
        int left = findHeight(node.left) + 1;
        int right = findHeight(node.right) + 1;
        return Math.max(left, right);
    }
}
