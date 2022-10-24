import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T> {

    private T[] stack;
    private int topIndex;
    private static final int default_capacity = 5;
    private static int currentSize;
    private int numberOfEntries = 0;

    public ArrayStack() {
        @SuppressWarnings("unchecked")
        T[] templist = (T[]) new Object[default_capacity];
        stack = templist;
        numberOfEntries = 0;
    }

    public void push(T newEntry) {

        if (numberOfEntries <= default_capacity) {
            currentSize = default_capacity;
        }

        if (numberOfEntries == default_capacity) {

            stack = Arrays.copyOf(stack, currentSize * 2);
            currentSize = currentSize * 2;
        }
        stack[numberOfEntries] = newEntry;
        numberOfEntries++;
    }

    public T pop() {
        T tempHolder = stack[numberOfEntries];
        stack[numberOfEntries] = null;
        numberOfEntries--;
        return tempHolder;

    }

    public T peek() {
        return stack[numberOfEntries - 1];
    }

    public boolean isEmpty() {
        return numberOfEntries == 0 ? true : false;
    }

    public void clear() {

    }

}
