public class App {
    public static void main(String[] args) throws Exception {

        AbstractList<Integer> list = new AbstractList<Integer>(1000);

        list.add(1);
        list.remove(0);
    }

}
