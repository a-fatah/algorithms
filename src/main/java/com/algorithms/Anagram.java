package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

  public static boolean isAnagram(String strA, String strB) {
    if(strA.length() != strB.length()) {
      return false;
    }

    Map<Character, Integer> frequenciesA = getFrequencies(strA);
    Map<Character, Integer> frequenciesB = getFrequencies(strB);

    for (int i = 0; i < strA.length(); i++) {
      char c = strA.charAt(i);
      if(frequenciesB.get(c) != frequenciesA.get(c)) {
        return false;
      }
    }
    return true;
  }

  private static Map<Character, Integer> getFrequencies(String strA) {
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (int i = 0; i < strA.length(); i++) {
      char current = strA.charAt(i);
      if (frequencyMap.containsKey(current)) {
        frequencyMap.put(current, frequencyMap.get(current) + 1);
      } else {
        frequencyMap.put(current, 1);
      }
    }

    return frequencyMap;
  }
}
