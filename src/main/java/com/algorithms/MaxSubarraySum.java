package com.algorithms;

/*
Write a function called maxSubarraySum which accepts an array of integers
and an integer n, and returns the maximum sum of any contiguous sequence
of n elements in the array.

Examples
maxSubarraySum([1, 2, 5, 2, 8, 1, 5], 4) returns 17 (for subarray [2, 5, 2, 8])

maxSubarraySum([1, 2, 5, 2, 8, 1, 5], 2) returns 10 (for subarray [2, 8])

maxSubarraySum([], 4) returns null
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubarraySum {

  static Integer maxSum(int[] arr, int n) {
    if(arr.length == 0) {
      return null;
    }
    int maxSum = 0;

    for (int[] subset : subsets(arr, n)) {
      maxSum = Math.max(maxSum, sum(subset));
    }

    return maxSum;
  }

  public static List<int[]> subsets(int[] arr, int n) {
    List<int[]> subsets = new ArrayList<>();

    for (int i = 0; i < arr.length - n; i++) {
      int[] subset = Arrays.copyOfRange(arr, i, i + n);
      subsets.add(subset);
    }

    return subsets;
  }

  static int sum(int[] arr) {
    return Arrays.stream(arr).reduce(0, (x, y) -> x + y);
  }
}
