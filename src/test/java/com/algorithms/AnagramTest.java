package com.algorithms;

import junit.framework.TestCase;

public class AnagramTest extends TestCase {

  public void testAnagram() {

    assertTrue(Anagram.isAnagram("ABCD", "DABC"));
    assertTrue(Anagram.isAnagram("AABB", "BBAA"));
    assertFalse(Anagram.isAnagram("AAAB", "AAB"));
    assertFalse(Anagram.isAnagram("ACBA", "ABBC"));
  }

}
