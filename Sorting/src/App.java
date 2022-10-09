public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // int[] arr = { 33, 31, 40, 8, 12, 17, 25, 42, 0, 2 };

        // arr = selectionSortIterative(arr);
        // arr = insertSelectionIterative(arr);
        // arr = sheelSortIterative(arr, arr.length);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // int[] nums = { -1, 0, 5 };

        // search(nums, 5);

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);

    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] selectionSortIterative(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            int mn_idx = 0;

            for (int j = i; j < arr.length - 1; j++) {

                if (arr[i] < arr[j]) {
                    mn_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mn_idx];
            arr[mn_idx] = temp;
        }

        return arr;
    }

    public static int[] insertSelectionIterative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }

        return arr;
    }

    public static int[] sheelSortIterative(int[] arr, int n) {

        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                int temp = arr[i];
                int j;
                int cnt = 0;

                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval) {
                    arr[j] = arr[j - interval];
                    cnt++;
                    // System.out.println(cnt);
                }
                arr[j] = temp;
            }

        }

        return arr;
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {

        // Find size of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
