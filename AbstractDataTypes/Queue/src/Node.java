public class Node<T> {

    private T data;
    private Node next;

    public Node(T newEntry, Node node) {
        this.data = newEntry;
        this.next = node;
    }

    public void setNextNode(Node newEntry) {
        this.next = newEntry;
    }

    public Node getNextNode() {
        return this.next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
