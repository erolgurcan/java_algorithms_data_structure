public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = { 5, 8, 10, 13, 15, 20, 22, 26, 30, 31, 34, 40 };

        int[] nums = { -1, 0, 3, 5, 9, 12 };

        final int array_size = 10000;
        int[] arrTest = new int[array_size];

        for (int i = 0; i < arrTest.length; i++) {
            arrTest[i] = i * (i - 1);
        }

        // long startTime = System.nanoTime();
        // binarySearchIterative1(nums, 9);
        binarySearchIterative2(nums, 9);

        // int low = 0;
        // int high = arrTest.length - 1;
        // binarySearchRecursive(arrTest, low, high, 92785056);

        // linearSearchIterative(arrTest, 99890030);
        // linearSearchRecursive(arrTest, 0, 99890030);

        // long endTime = System.nanoTime();
        // long totalTime = endTime - startTime;
        // System.out.println(totalTime / 1000);
    }

    public static int linearSearchRecursive(int[] arr, int index, int toFind) {

        System.out.println(index);
        if (index < arr.length) {

            if (arr[index] == toFind) {
                System.out.println("Found at index " + index);
                return index;
            } else {
                linearSearchRecursive(arr, index + 1, toFind);
            }
        } else if (index == arr.length - 1) {
            return -1;
        }
        return -1;
    }

    public static int linearSearchIterative(int[] arr, int toFind) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == toFind) {
                System.out.println("Found at index" + i);
                return i;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int toFind) {

        if (low <= high) {
            System.out.println("low:" + low + "high " + high);
            int mid = low + (high - low) / 2;

            if (arr[mid] == toFind) {
                System.out.println("Found at index" + mid);
                return mid;
            }

            if (arr[mid] < toFind) {
                return binarySearchRecursive(arr, mid + 1, high, toFind);
            }

            return binarySearchRecursive(arr, low, mid - 1, toFind);

        }

        return -1;
    }

    public static int binarySearchIterative1(int[] arr, int toFind) {

        int low = 0;
        int high = arr.length - 1;

        while (high - low > 1) {

            // finding mid point
            int mid = (high + low) / 2;

            if (arr[mid] < toFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        int result = arr[high] == toFind ? high : (arr[low] == toFind) ? low : -1;
        System.out.println("Result found at index " + result);
        return result;

    }

    public static int binarySearchIterative2(int[] arr, int toFind) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == toFind) {
                System.out.println("Result found at index " + mid);
                return mid;
            }

            if (arr[mid] < toFind) {
                low = mid + 1;
            } else
                high = mid - 1;

        }
        System.out.println("Not found");
        return -1;

    }
}