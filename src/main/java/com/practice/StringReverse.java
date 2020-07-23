package com.practice;

public class StringReverse {
  
  public static String reverseString(String input) {
    if(input.length() == 1) {
      return input;
    }
    String output = "";
    final char[] inputChar = input.toCharArray();
    // You can iterate from the back 
    /*for (int i = inputChar.length -1 ; i >= 0 ; i --) {
      output = output + (inputChar[i]);
    }
    */
    // Or you can iterate from the front
    for (int i = 0 ; i < inputChar.length ; i ++) {
      output = (inputChar[i]) + output;
    }
    return output;
  }

}
