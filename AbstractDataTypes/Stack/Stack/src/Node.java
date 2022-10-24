public class Node<T> {

    private T data;
    private Node next;

    public Node(T newEntry, Node topNode) {

        this.data = newEntry;
        this.next = topNode;
    }

    public T getData() {
        return this.data;
    }

    public Node getNextNode() {
        return next;
    }
}
