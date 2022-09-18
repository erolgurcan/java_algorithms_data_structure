public class App {
    public static void main(String[] args) throws Exception {
        // 1) Write a recursive method that accepts two arguments into the parameter x
        // and y.
        // The function should return a value of x times y. Remember multiplication can
        // be
        // performed as repeated addition as follows:

        System.out.println(multiply(7, 4));

    }

    public static int multiply(int x, int y) {
        if (y > 0) {
            return x + multiply(x, y - 1);
        } else {
            return 0;
        }
    }

}
