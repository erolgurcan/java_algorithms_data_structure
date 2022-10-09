import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1) Write a recursive method that accepts two arguments into the parameter x
        // and y.
        // The function should return a value of x times y. Remember multiplication can
        // be
        // performed as repeated addition as follows:

        // System.out.println(multiply(7, 4));

        // 2) Write a method that returns the largest value in an array that is passed
        // as an argument.
        // The method should use recursion to find the largest element.

        // int[] arr = { 5, 8, 2, 9, 7 };
        // int cnt = 0;

        // System.out.print(findLargest(arr, cnt, 0));

        // 3) Consider the method displayRowOfCharacters that displays any given
        // character the specified number times on one line. For example, the call

        System.out.println(displayRowOfCharacters("*", 5));

        // 4) Write a method that asks the user for integer input that is between 1 and
        // 10, inclusive.
        // If the input is out of range, the method should recursively ask the user to
        // enter a new input value.

        // betweenNumbers(1, 10);

        // 5) Write a recursive method that displays a portion of a given array
        // backward. Consider the last entry in the portion first.

        int[] arr = { 5, 8, 2, 9, 7 };
        int[] arrOut = new int[arr.length];

        int[] arrOutDone = reverseArray(arr, arrOut, arr.length);

        for (int i = 0; i < arrOutDone.length; i++) {
            System.out.println(arrOutDone[i]);
        }

        // f(16);

    }

    public static int f(int n) {
        int result = 0;
        if (n < 4) {
            System.out.println("n=" + n);
            result = 1;
        } else {
            System.out.println("n = " + n);
            result = f(n / 2);
            System.out.println("n => " + n);
            result = result += f(n / 4);
        }
        return result;
    }

    public static int[] reverseArrayRecursive(int[] arr, int[] arrOut, int cnt) {
        if (cnt == 0) {
            return arrOut;
        } else {
            arrOut[cnt - 1] = arr[arr.length - cnt];
            return reverseArrayRecursive(arr, arrOut, cnt - 1);
        }
    }

    public static int[] reverseArray(int[] arr, int[] arrOut, int i) {

        if (i == 0) {
            return arrOut;
        } else
            arrOut[arr.length - i] = arr[i - 1];
        System.out.println(i + " " + (arr.length - i) + " " + arr[i - 1]);
        return reverseArray(arr, arrOut, i - 1);

    }

    public static int betweenNumbers(int low, int high) {

        Scanner input = new Scanner(System.in);

        int s = input.nextInt();

        if (s >= low && s <= high) {
            return s;
        } else
            return betweenNumbers(low, high);

    }

    public static String displayRowOfCharacters(String x, int i) {

        if (i <= 1) {
            return x;
        } else
            x = x + x.charAt(0);
        return displayRowOfCharacters(x, i - 1);

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

}
