package TreesAndGraphs;

public class NodeWithParent<T> {

    public NodeWithParent<T> left;
    public NodeWithParent<T> right;

    public NodeWithParent<T> parent;
    public T value;

    public NodeWithParent(T value) {
        this.value = value;
    }

    public NodeWithParent(T value, NodeWithParent<T> left, NodeWithParent<T> right, NodeWithParent<T> parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
