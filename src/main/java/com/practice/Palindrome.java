package com.practice;


public class Palindrome {

  public Boolean isPalindrome(String input) {
    if (input.length() <= 1)
      return true;
    String output = "";
    final char[] inputChar = input.toCharArray();
   
    for (int i = 0 ; i < inputChar.length ; i ++) {
      output = (inputChar[i]) + output;
    }
    if (output.equals(input)) {
      return true;
    }
    return false;
  }

}
