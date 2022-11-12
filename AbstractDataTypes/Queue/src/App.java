public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String a = "erol";
        String b = "eve";
        String c = "Tom";
        String d = "Hank";

        ADTQueue<String> adtQueue = new ADTQueue<String>();

        adtQueue.enqueue(a);
        adtQueue.enqueue(b);
        adtQueue.enqueue(c);
        adtQueue.enqueue(d);

    }
}
