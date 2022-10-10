import java.util.Arrays;

public class AList<T> implements ListInterface<T> {

    private T[] list;
    private int numberOfEntries;
    private boolean integrityOK;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public AList() {
        System.out.println("Default Constructor Initiated");
    }

    public AList(int initialCapacity) {

        integrityOK = false;

        if (initialCapacity < DEFAULT_CAPACITY) {
            initialCapacity = DEFAULT_CAPACITY;
        } else {
            checkCapacity(initialCapacity);
        }

        @SuppressWarnings("unchecked")
        T[] templist = (T[]) new Object[initialCapacity + 1];

        list = templist;
        numberOfEntries = 0;
        integrityOK = true;

    }

    public void checkIntegrity() {
        if (!integrityOK) {
            throw new SecurityException("Array is corrupt");
        }
    }

    public void add(T newEntry) {

        checkIntegrity();
        list[numberOfEntries + 1] = newEntry;
        numberOfEntries++;
        ensureCapacity();

    }

    public void makeRoom(int newPosition) {
        int newLength = 2 * list.length;
        checkCapacity(newLength);
        list = Arrays.copyOf(list, newLength);
    }

    public void add(int newPosition, T newEntry) {

        checkIntegrity();
        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
            if (newPosition <= numberOfEntries) {
                makeRoom(newPosition);
            }
            list[newPosition] = newEntry;
            numberOfEntries++;
            ensureCapacity();
        } else {
            throw new IndexOutOfBoundsException("Given position of add's new entry is out of bounds.");
        }

    }

    public T remove(int givenPosition) {

        checkIntegrity();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            T result = list[givenPosition];
            if (givenPosition < numberOfEntries) {
                removeGap(givenPosition);
            }
            numberOfEntries--;
            return result;
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to remove operation.");
        }

    }

    public void removeGap(int givenPosition) {
        for (int index = givenPosition; index < numberOfEntries; index++) {
            list[index] = list[index + 1];
        }
    }

    public void clear() {

        checkIntegrity();
        while (numberOfEntries > 0) {
            list[numberOfEntries] = null;
            numberOfEntries--;
        }

    }

    public boolean replace(int givenPosition, T newEntry) {

        checkIntegrity();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            list[givenPosition] = newEntry;
            return true;
        } else {
            return false;
        }

    }

    public T getEntry(int givenPosition) {

        checkIntegrity();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            return list[givenPosition];
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
        }

    }

    public int getLength() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    private void ensureCapacity() {

        int capacity = list.length - 1;
        if (numberOfEntries >= capacity) {
            int newCapacity = 2 * capacity;
            checkCapacity(newCapacity);
            list = Arrays.copyOf(list, newCapacity + 1);
        }

    }

    private void checkCapacity(int capacity) {

        if (capacity > MAX_CAPACITY) {
            throw new IllegalStateException(
                    "Attempt to create a list whose capacity exceeds allowed maximum of " + MAX_CAPACITY);
        }

    }

    @Override
    public T[] toArray() {

        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = list[index + 1];
        }

        return result;

    }

    @Override
    public boolean contains(T anEntry) {

        boolean found = false;
        int index = 1;
        while (!found && (index <= numberOfEntries)) {
            if (anEntry.equals(list[index])) {
                found = true;
            }
            index++;
        }

        return found;

    }

}
