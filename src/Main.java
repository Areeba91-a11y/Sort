import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

import java.util.Arrays;

/** Demo runner for the sorting algorithms. */
public class Main {

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11, 90, 5};
        System.out.println("Original  : " + Arrays.toString(original));

        int[] bubble = original.clone();
        BubbleSort.sort(bubble);
        System.out.println("Bubble    : " + Arrays.toString(bubble));

        int[] selection = original.clone();
        SelectionSort.sort(selection);
        System.out.println("Selection : " + Arrays.toString(selection));

        int[] insertion = original.clone();
        InsertionSort.sort(insertion);
        System.out.println("Insertion : " + Arrays.toString(insertion));
    }
}
