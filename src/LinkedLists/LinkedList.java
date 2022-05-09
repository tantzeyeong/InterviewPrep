package LinkedLists;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }
    public LinkedList(T[] arr) {
        if (arr.length == 0) {
            head = null;
        } else {
            Node<T> node = new Node<>(arr[arr.length - 1], null);
            for (int i = arr.length - 2; i >= 0; i--) {
                Node<T> newNode = new Node<>(arr[i], null);
                newNode.next = node;
                node = newNode;
            }
            head = node;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean delete(int index) {
        if (index == 0) {
            this.head = this.head.next;
            return true;
        }
        Node<T> head = this.head;
        int count = 0;
        while (count != index - 1) {
            count += 1;
            head = head.next;
            if (head.next == null) {
                return false;
            }
        }
        Node<T> p = head;
        Node<T> n = head.next.next;
        p.next = n;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null) {
            String val = node.data.toString();
            stringBuilder.append(val);
            stringBuilder.append(" -> ");
            node = node.next;
        }
        int stringLength = stringBuilder.length();
        if (stringLength > 4) {
            stringBuilder.delete(stringLength - 4, stringLength);
        }
        return stringBuilder.toString();
    }
}

//
//
//package LinkedLists;
//import LinkedLists.Node;
//
//public class LinkedList<T> {
//    Node<T> head;
//
//    private LinkedList(T data) {
//        Node<T> newNode = Node.of(data);
//        this.head = newNode;
//    }
//
//    public static <T> LinkedList<T> of(T data) {
//        return new LinkedList<T>(data);
//    }
//
//    public void insert(T data) {
//        Node<T> newNode = Node.of(data);
//        newNode.next = this.head;
//        this.head = newNode.next;
//    }
//
//
//}