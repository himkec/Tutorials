package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {
  static int max = 0;
  static char maxChar;
  public static char mostCommon(final String input) {
    if (input.isEmpty()) {
      throw new RuntimeException("Please provide valid input");
    }
    final char[] inputArray = input.toCharArray();
    final Map<Character,Integer> charMap = new HashMap<>();
    for (char key : inputArray) {
      if(charMap.containsKey(key)) {
        charMap.replace(key, charMap.get(key) + 1);
      }
      else {
        charMap.put(key, 1);
      }
    }
    /*
    for (Map.Entry<Character,Integer> entry : charMap.entrySet()) {
      Character key = entry.getKey();
      int value = entry.getValue();
      if (value > max) {
        max = value;
        maxChar = key;
      }
     }
    */
    for (Character ch : charMap.keySet()) {
      if (charMap.get(ch) > max) {
        max = charMap.get(ch);
        maxChar = ch;
      }
    }
    return maxChar;   
  }

}
