package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;

public class FirstCommonAncestor {

    public static <T> Node<T> solve(Node<T> root, Node<T> first, Node<T> second) {
        if (first == second) {
            return first;
        }
        List<Node<T>> list = new ArrayList<>();
        list.add(null);
        solveHelper(root, first, second, list);
        return list.get(0);
    }

    public static <T> boolean solveHelper(Node<T> node, Node<T> first, Node<T> second, List<Node<T>> list) {
        if (node == null) {
            return false;
        }
        boolean cond = node == first || node == second;

        boolean left = solveHelper(node.left, first, second, list);
        boolean right = solveHelper(node.right, first, second, list);

        if (((left && right) || (left && cond || right && cond)) && list.get(0) == null) {
            list.set(0, node);
        }

        if (cond) {
            return true;
        }

        return left || right;
    }
}
