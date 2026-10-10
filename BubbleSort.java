package sorting;

/**
 * Bubble Sort: repeatedly swaps adjacent out-of-order elements.
 * Time: O(n^2) worst/average, O(n) best (already sorted). Space: O(1). Stable.
 */
public final class BubbleSort {

    private BubbleSort() {
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // already sorted
            }
        }
    }
}
