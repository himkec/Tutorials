package com.practice;

public class ChunkArray {

  public static int[][] chunk(int[] input, int size) {
    
    // Validation
    if (input == null || size < 1) {
      throw new RuntimeException("Please provide valid inputs");
    }
    if (size >= input.length) {
      int[][] output = new int[][]{ input };
      return output;
    }
    
    // created output array
    int numberOfArrays;
    if (input.length % size == 0) {
     numberOfArrays = input.length/size;
    }else {
      numberOfArrays = input.length/size+1;
    }
    int [][] result = new int [numberOfArrays][size];
    
    
    
    return null;
  }

}
