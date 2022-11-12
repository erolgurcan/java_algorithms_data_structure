import java.text.Normalizer.Form;

public class ADTCircularArray<T> {

    private T[] queue;
    private int frontIndex;
    private int backIndex;
    private static final int DEFAULT_CAPACITY = 6;
    private static final int MAX_CAPACITY = 10000;

    public ADTCircularArray() {
        this(DEFAULT_CAPACITY);
    }

    public ADTCircularArray(int inittialCapacity) {

        @SuppressWarnings("unchecked")
        T[] tempQueue = (T[]) new Object[inittialCapacity + 1];

        queue = tempQueue;
        frontIndex = 0;
        backIndex = inittialCapacity;

    }

    public void enqueue(T newEntry) {

        ensureCapacity();
        backIndex = (backIndex + 1) % queue.length;
        queue[backIndex] = newEntry;

    }

    public T getFront() {

        return isEmpty() == true ? null : queue[frontIndex];
    }

    public T dequeue() {

        if (isEmpty()) {
            throw new Error("Array is empty");
        } else {
            T front = queue[frontIndex];
            queue[frontIndex] = null;
            frontIndex = (frontIndex + 1) % queue.length;
            return front;
        }

    }

    private boolean isEmpty() {
        return frontIndex == ((backIndex + 1) % queue.length);
    }

    private void ensureCapacity() {

        if (frontIndex == (backIndex + 2) % queue.length) {

            T[] oldQueue = queue;
            int oldSize = oldQueue.length;
            int newSize = oldSize * 2;

            @SuppressWarnings("unchecked")
            T[] tempQueue = (T[]) new Object[newSize];
            queue = tempQueue;

            for (int i = 0; i < oldSize - 1; i++) {
                queue[i] = oldQueue[frontIndex];
                frontIndex = (frontIndex + 1) % oldSize;
            }

            frontIndex = 0;
            backIndex = oldSize - 2;

        }

    }

}
