public class Heaps {

    public static void main(String[] args) throws Exception {

        // MaxHeap hp = new MaxHeap(10);

        // hp.add(10);
        // hp.add(20);
        // hp.add(30);
        // hp.add(40);
        // hp.add(50);

        // hp.display();

        // hp.removeMax();

        // System.out.println("");
        // hp.display();

        System.out.println("The Max Heap is ");
        GFC maxHeap = new GFC(15);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(50);

        maxHeap.maxHeap();

        maxHeap.print();
        maxHeap.remove();
        maxHeap.print();

        System.out.println("The max val is " + maxHeap.remove());

    }

}
