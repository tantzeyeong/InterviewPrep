package TreesAndGraphs;

public class Successor {

    public static NodeWithParent<Integer> solve(NodeWithParent<Integer> node) {
        NodeWithParent<Integer> res = node;
        if (res.right != null) {
            res = res.right;
            while (res.left != null) {
                res = node.left;
            }
            return res;
        }
        while (res.parent != null) {
            if (res.parent.value > res.value) {
                return res.parent;
            }
            res = res.parent;
        }
        return null;
    }
}
