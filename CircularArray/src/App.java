import java.util.ArrayDeque;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ADTCircularArray<String> adtCircular = new ADTCircularArray<String>();

        String a = "Erol";
        String b = "Eve";
        String c = "Tim";
        String d = "Hank";
        String e = "Steve";
        String f = "Elon";
        String g = "Kevin";
        String h = "Howard";

        adtCircular.enqueue(a);
        adtCircular.enqueue(b);
        adtCircular.enqueue(c);
        adtCircular.enqueue(d);
        adtCircular.enqueue(e);
        adtCircular.dequeue();
        adtCircular.enqueue(f);
        adtCircular.enqueue(g);
        adtCircular.enqueue(h);
        adtCircular.dequeue();
        adtCircular.dequeue();

    }
}
