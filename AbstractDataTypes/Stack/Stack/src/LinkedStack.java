import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T> {

    private Node topNode;
    private int numberOfEntries;

    public LinkedStack() {
        topNode = null;
    }

    public void push(T newEntry) {

        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
        numberOfEntries++;
    }

    public T pop() {
        return null;
    }

    public T peek() {

        if (isEmpty()) {
            throw new StackOverflowError();
        } else
            return (T) topNode.getData();

    }

    public boolean isEmpty() {
        return numberOfEntries == 0 ? true : false;
    }

    public void clear() {

    }
}
