public interface QueueInterface<T> {

    public default void enqueue(T newEntry) {

    }

    public default void dequeue() {
    };

    public default T getFront() {
        return null;
    }

    public default boolean isEmpty() {
        return false;
    }

    public default void clear() {

    }
}
