public class LListApp<T> implements AbstractLinkedList<T> {

    private Node firstNode;
    private int numberOfEntries;

    public LListApp() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public void display() {

        Node currentNode = firstNode;

        int i = 0;
        while (currentNode != null) {

            System.out.println(i + "<-->" + currentNode.data.toString());
            currentNode = currentNode.getNextNode;
            i++;
        }
    }

    @Override
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);

        newNode.getNextNode = firstNode;

        firstNode = newNode;
        numberOfEntries++;
    }

    @Override
    public void add(int newPosition, T newEntry) {

        if (newPosition == 1) {
            add(newEntry);
        } else {

            Node currentNode = firstNode;
            Node newNode = new Node(newEntry);

            for (int i = 0; i < newPosition; i++) {
                currentNode = currentNode.getNextNode();
            }

            Node beforeNode = currentNode;
            Node afterNode = currentNode.getNextNode;

            newNode.getNextNode = afterNode;
            beforeNode.getNextNode = newNode;
            numberOfEntries++;
        }
    }

    @Override
    public void remove(int givenPosition) {

        Node currentNode = firstNode;

        if (givenPosition == 0) {

            currentNode = currentNode.getNextNode;
            firstNode = currentNode;
            numberOfEntries--;
            return;

        }

        for (int i = 0; i < givenPosition - 1; i++) {
            currentNode = currentNode.getNextNode;
        }

        Node beforeNode = currentNode;
        Node afterNode = currentNode.getNextNode;
        afterNode = afterNode.getNextNode;
        beforeNode.getNextNode = afterNode;
        numberOfEntries--;

    }

    @Override
    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    @Override
    public void replace(int givenPosition, T newEntry) {

        Node currentNode = firstNode;
        Node newNode = new Node(newEntry);

        if (numberOfEntries > 0) {

            if (givenPosition == 0) {
                currentNode = currentNode.next;
                newNode.next = currentNode;
                firstNode = newNode;
                return;
            }
            for (int i = 0; i < givenPosition - 1; i++) {
                currentNode = currentNode.next;
            }
            Node beforeNode = currentNode;
            Node AfterNode = currentNode.next;
            AfterNode = AfterNode.next;
            newNode.next = AfterNode;
            beforeNode.next = newNode;
        } else {
            System.out.println("List is empty");
        }

    }

    @Override
    public T getEntry(int givenPosition) {

        Node currentNode = firstNode;

        if (numberOfEntries > 0) {
            for (int i = 0; i < givenPosition - 1; i++) {

                currentNode = currentNode.next;
            }

            return (T) currentNode.getNodeData();
        }
        return null;

    }

    @Override
    public T[] toArray() {

        Node currentNode = firstNode;
        Object[] arr = new Object[numberOfEntries];

        for (int i = 0; i <= numberOfEntries; i++) {

            arr[i] = currentNode.getNodeData();

            currentNode = currentNode.next;
        }

        return (T[]) arr;

    }

    @Override
    public boolean contains(T anEntry) {

        if (numberOfEntries > 0) {

            Node currentNode = firstNode;
            Node searchNode = new Node(anEntry);

            while (currentNode != null) {

                if (currentNode == searchNode) {
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;

        }
        return false;
    }

    @Override
    public int getLength() {

        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {

        return numberOfEntries == 0 ? true : false;
    }

}
