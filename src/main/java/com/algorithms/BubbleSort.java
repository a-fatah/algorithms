package com.algorithms;

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
          swap(array, j - 1, j);
        }
      });
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
