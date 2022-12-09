public class Node<T> {

    public T data;
    public Node next;

    Node(T data) {
        this(data, null);
    }

    public Node(T d, Node nextNode) {
        data = d;
        next = nextNode;
    }

    public T getNodeData() {
        return data;

    }

    public Node getNextNode() {
        return next;
    }

}
