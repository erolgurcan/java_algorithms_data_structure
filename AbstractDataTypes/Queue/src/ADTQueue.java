import javax.lang.model.util.ElementScanner14;

public class ADTQueue<T> implements QueueInterface<T> {

    private Node firstNode;
    private Node lastNode;

    public ADTQueue() {
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

    @Override
    public T dequeue() {
        // TODO Auto-generated method stub

        T front = getFront();
        firstNode.setData(null);

        firstNode = firstNode.getNextNode();

        if (firstNode == null) {
            lastNode = null;
        }

        return front;

    }

    @Override
    public T getFront() {
        // TODO Auto-generated method stub

        if (isEmpty()) {
            throw new Error("Error");
        } else {
            return (T) firstNode.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (firstNode == null) && (lastNode == null);

    }

    @Override
    public void clear() {
        lastNode = null;
        firstNode = null;

    }

}
