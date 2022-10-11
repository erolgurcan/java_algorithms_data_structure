public class AbstractList<T> implements InterfaceList<T> {

    public int MAX_SIZE = 1000;
    public int DEFAULT_SIZE;
    public T[] array;
    public int CURRENT_SIZE;

    @SuppressWarnings("unchecked")
    AbstractList() {
        T[] tempList = (T[]) new Object[MAX_SIZE];
        array = tempList;
        CURRENT_SIZE = 0;
    }

    @SuppressWarnings("unchecked")
    AbstractList(int INITIALSIZE) {

        if (INITIALSIZE > MAX_SIZE) {
            throw new ArrayIndexOutOfBoundsException("Max value " + MAX_SIZE + " exceeded");

        }
        T[] tempList = (T[]) new Object[MAX_SIZE];
        array = tempList;
        CURRENT_SIZE = 0;
    }

    @Override
    public void add(T newEntry) {
        array[CURRENT_SIZE] = newEntry;
        CURRENT_SIZE++;
    }

    @Override
    public void add(int newPosition, T newEntry) {
        array[newPosition] = newEntry;
        CURRENT_SIZE++;
    }

    @Override
    public void remove(int givenPosition) {
        array[givenPosition] = null;

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public void replace(int givenPosition, T newEntry) {
        // TODO Auto-generated method stub

    }

    @Override
    public T getEntry(int GivenPosition) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean contains(int newEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

}
