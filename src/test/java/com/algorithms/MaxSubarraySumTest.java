package com.algorithms;

import junit.framework.TestCase;

import static com.algorithms.MaxSubarraySum.maxSum;

public class MaxSubarraySumTest extends TestCase {

  public void testMaxSum() {
    assertEquals(((int) maxSum(new int[]{1, 2, 5, 2, 8, 1, 5}, 4)), 17);
    assertEquals(((int) maxSum(new int[]{1, 2, 5, 2, 8, 1, 5}, 2)), 10);
    assertNull(maxSum(new int[]{}, 4));
  }

}
