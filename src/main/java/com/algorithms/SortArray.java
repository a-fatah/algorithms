package com.algorithms;

/*
You are given an array that contains the consecutive integers  [1, 2, 3, ..., n]
in some arbitrary order, without gaps or duplicates. You are allowed to swap any
two elements.

You need to find the minimum number of swaps required to sort the array in ascending order.
For example, given the array  arr = [7, 1, 3, 2, 4, 5, 6] we perform the following steps:

        i   arr                     swap (indices)
        0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
        1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
        2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
        3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
        4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
        5   [1, 2, 3, 4, 5, 6, 7]
*/


public class SortArray {

  public static void main(String[] args) {
    int swaps = swaps(new int[]{7, 1, 3, 2, 4, 5, 6});
    System.out.println(swaps);
  }


  static int swaps(int[] numbers) {
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] != i + 1) {
        swap(numbers, i, numbers[i] - 1);
        count ++;
      }
    }
    return count;
  }

  private static void swap(int[] arr, int i, int j)  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
