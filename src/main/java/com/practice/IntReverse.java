package com.practice;

public class IntReverse {
  
  public int reverseInt(int input) {
    int reverse = 0;
    if(input >= -9 && input <= 9) {
      return input;
    }
    while (input != 0) {
      int last = input % 10;
      input = input/10;
      reverse = (reverse * 10) + last;
    }
    return reverse;
  }
}
