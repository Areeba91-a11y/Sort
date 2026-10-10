package sorting;

/**
 * Selection Sort: repeatedly selects the minimum of the unsorted part
 * and places it at the next position.
 * Time: O(n^2) in all cases. Space: O(1). Not stable.
 */
public final class SelectionSort {

    private SelectionSort() {
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
