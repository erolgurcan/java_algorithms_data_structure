public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // int[] arr = { 5, 8, 3, 6, 4, 1 };

        // arr = selectionSortIterative(arr);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        int[] nums = { -1, 0, 5 };

        search(nums, 5);

    }

    public static int[] selectionSortIterative(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }

            }

            int min_num = arr[min_idx];

            arr[min_idx] = arr[i];
            arr[i] = min_num;

        }

        return arr;
    }

    public static int search(int[] nums, int target) {

        if (nums[0] == target)
            return 0;
        if (nums.length > 1 && nums[1] == target)
            return 1;

        int low = 0;
        int high = nums.length - 1;

        while (high - low >= 1) {

            int middle = low + (high - low) / 2;

            if (nums[middle] == target) {
                System.out.println("Found at index " + middle);
                return middle;
            }

            if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

        }

        return -1;

    }

}
