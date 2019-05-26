package sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,5,4,2};
        bubbleSort(array);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        IntStream.range(0, n - 1)
            .flatMap(i -> IntStream.range(1, n - i))
            .forEach(j -> {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            });
    }
}
