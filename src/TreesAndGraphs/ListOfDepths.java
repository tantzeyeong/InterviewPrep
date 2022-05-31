package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfDepths<T> {

    public static <T> List<LinkedList<T>> solve(BST<T> bst) {
        List<LinkedList<T>> list = new ArrayList<>();
        Node<T> node = bst.root;
        solveHelper(list, node,0);
        return list;
    }

    public static <T> void solveHelper(List<LinkedList<T>> list, Node<T> node, int level) {
        if (node == null) {
            return;
        }
        if (level > list.size() - 1) {
            LinkedList<T> linkedList = new LinkedList<>();
            linkedList.add(node.value);
            list.add(linkedList);
        } else {
            list.get(level).add(node.value);
        }
        solveHelper(list, node.left, level + 1);
        solveHelper(list, node.right, level + 1);
    }
}
