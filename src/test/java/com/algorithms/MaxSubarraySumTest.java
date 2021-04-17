package com.algorithms;

import junit.framework.TestCase;

public class MaxSubarraySumTest extends TestCase {

  public void testMaxSum() {
    int actual = MaxSubarraySum.maxSum(new int[]{1, 2, 5, 2, 8, 1, 5}, 4);

    assertEquals(actual, 17);

    int sum = MaxSubarraySum.maxSum(new int[]{1, 2, 5, 2, 8, 1, 5}, 2);
    assertEquals(sum, 10);

    assertEquals(MaxSubarraySum.maxSum(new int[]{}, 4), null);
  }

}
