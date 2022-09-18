public class App {
    public static void main(String[] args) throws Exception {
        // 1) Write a recursive method that accepts two arguments into the parameter x
        // and y.
        // The function should return a value of x times y. Remember multiplication can
        // be
        // performed as repeated addition as follows:

        System.out.println(multiply(7, 4));

        // 2) Write a method that returns the largest value in an array that is passed
        // as an argument.
        // The method should use recursion to find the largest element.

        int[] arr = { 5, 8, 2, 9, 7 };
        int cnt = 0;

        System.out.print(findLargest(arr, cnt, 0));
    }

    public static int findLargest(int[] arr, int cnt, int largest) {

        if (cnt < arr.length) {

            if (largest < arr[cnt]) {
                largest = arr[cnt];
                System.out.println(arr[cnt] + " " + largest + " " + cnt);
                return findLargest(arr, cnt + 1, largest);
            } else {
                System.out.println(arr[cnt] + " " + largest + " " + cnt);
                return findLargest(arr, cnt + 1, largest);
            }

        } else {
            System.out.println("last" + " " + largest);
            return largest;
        }

    }

    public static int multiply(int x, int y) {
        if (y > 0) {
            return x + multiply(x, y - 1);
        } else {
            return 0;
        }
    }

}
