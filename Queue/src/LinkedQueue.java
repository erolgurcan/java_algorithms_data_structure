public class LinkedQueue<T> implements QueueInterface<T> {

    private Node firstNode;
    private Node lastNode;

    public LinkedQueue() {
        firstNode = null;
        lastNode = null;
    }

    public void enqueue(T newEntry) {

        Node newNode = new Node(newEntry, null);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;

    }

    public void dequeue() {
        T front = getFront(); // Might throw EmptyQueueException
        // Assertion: firstNode != null
        firstNode.setData(null);
        firstNode = firstNode.getNextNode();

        if (firstNode == null)
            lastNode = null;

        return front;

    };

    public T getFront() {
        return (T) firstNode.getData();
    }

    public boolean isEmpty() {
        return false;
    }

    public void clear() {

    }

}
