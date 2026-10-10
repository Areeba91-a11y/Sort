package sorting;

/**
 * Insertion Sort: builds the sorted array one element at a time by
 * inserting each element into its correct position.
 * Time: O(n^2) worst/average, O(n) best. Space: O(1). Stable.
 */
public final class InsertionSort {

    private InsertionSort() {
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
