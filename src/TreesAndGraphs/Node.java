package TreesAndGraphs;

public class Node<T> {
    public Node<T> left;
    public Node<T> right;
    T value;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
