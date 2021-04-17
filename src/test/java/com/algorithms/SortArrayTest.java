package com.algorithms;

import junit.framework.TestCase;

public class SortArrayTest extends TestCase {

  public void testSwaps() {
    assertEquals(SortArray.swaps(new int[]{7, 1, 3, 2, 4, 5, 6}), 5);
    assertEquals(SortArray.swaps(new int[]{1, 2, 4, 3, 5, 6}), 1);
  }

}
