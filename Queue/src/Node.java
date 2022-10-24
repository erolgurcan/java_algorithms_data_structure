public class Node<T> {

    private T firstNode;
    private Node next;

    Node(T firstNode, Node nextNode) {
        this.firstNode = firstNode;
        this.next = nextNode;
    }

    public Node setNextNode(Node next) {
        return next;
    }

    public T getData() {
        return firstNode;
    }

}
