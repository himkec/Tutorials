package com.practice;

public class FizzBuzz {

  public static String fBuzz(int i) {
    if (i < 1 ) {
      throw new RuntimeException("Please provide valid input between 1 and n");
    }
    String output = "";
    if (i % 3 == 0) {
      output = output.concat("Fizz");
    }
    if (i % 5 == 0) {
      output = output.concat("Buzz");
    }
    return output;
  }

}
