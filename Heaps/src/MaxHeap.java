import javax.swing.JSpinner.ListEditor;

public class MaxHeap {

    private int[] heap;
    private int lastIndex;

    public MaxHeap(int initialCapacity) {

        int[] temp = new int[initialCapacity];
        heap = temp;
        lastIndex = 0;

    }

    public int getMax() {
        return heap[1];
    }

    public boolean isEmpty() {
        return lastIndex < 1;
    }

    public int getSize() {
        return lastIndex;
    }

    public void add(int newEntry) {

        int newIndex = lastIndex + 1;
        int parentIndex = newIndex / 2;

        while ((parentIndex > 0) && newEntry > heap[parentIndex]) {

            heap[newIndex] = heap[parentIndex];
            newIndex = parentIndex;
            parentIndex = newIndex / 2;
        }

        heap[newIndex] = newEntry;
        lastIndex++;

    }

    public int removeMax() {

        int root = heap[1];
        heap[1] = heap[lastIndex];
        lastIndex--;
        rehap(1);

        return root;
    }

    private void rehap(int rootIndex) {

        boolean done = false;
        int orphan = heap[rootIndex];
        int leftChildIndex = 2 * rootIndex;

        while (!done && (leftChildIndex <= lastIndex)) {

            int largerChildIndex = leftChildIndex;
            int rightChildIndex = leftChildIndex + 1;

            if ((rightChildIndex <= lastIndex) && (heap[rightChildIndex] > heap[largerChildIndex])) {
                largerChildIndex = rightChildIndex;
            }

            if (orphan < heap[largerChildIndex]) {
                heap[rootIndex] = heap[largerChildIndex];
                rootIndex = largerChildIndex;
                leftChildIndex = 2 * rootIndex;
            } else {
                done = true;
            }
        }
        heap[rootIndex] = orphan;
    }

    // private void rehap(int rootIndex) {

    // boolean done = false;

    // // Create rehap
    // int orphan = heap[rootIndex];
    // int leftChildIndex = 2 * rootIndex;

    // while (!done && (leftChildIndex <= lastIndex)) {

    // int largerChildIndex = leftChildIndex;

    // int rightChildIndex = leftChildIndex + 1;

    // if ((rightChildIndex <= lastIndex) && (heap[rightChildIndex] >
    // heap[largerChildIndex])) {
    // largerChildIndex = rightChildIndex;
    // }

    // if (orphan < heap[largerChildIndex]) {
    // heap[rootIndex] = heap[largerChildIndex];
    // rootIndex = largerChildIndex;
    // leftChildIndex = 2 * rootIndex;
    // } else {
    // done = true;
    // }

    // }

    // heap[rootIndex] = orphan;

    // }

    // boolean done = false;
    // int orphan = heap[rootIndex];
    // int leftChildIndex = 2 * rootIndex + 1;

    // while (!done && (leftChildIndex <= lastIndex)) {

    // int largerChildIndex = leftChildIndex;
    // int rightChildIndex = leftChildIndex + 1;

    // if ((rightChildIndex <= lastIndex) && (heap[rightChildIndex] >
    // heap[largerChildIndex])) {
    // largerChildIndex = rightChildIndex;
    // }

    // if (orphan < heap[largerChildIndex]) {
    // heap[rootIndex] = heap[largerChildIndex];
    // rootIndex = largerChildIndex;
    // leftChildIndex = 2 * rootIndex + 1;
    // } else
    // done = true;

    // }
    // heap[rootIndex] = orphan;

    public void display() {

        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i] + " ");
        }
    }

}
