public interface StackInterface<T> {

    public default void push(T newEntry) {

    }

    public default T pop() {
        return null;
    }

    public default T peek() {
        return null;
    }

    public default boolean isEmpty() {
        return false;
    }

    public default void clear() {

    }

}
