package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.practice.FizzBuzz;

public class FizzBuzzTest {
  
  @Test
  public void fizzBuzzTest() {
    assertEquals("Fizz",FizzBuzz.fBuzz(3));
    assertEquals("Buzz",FizzBuzz.fBuzz(5));
    assertEquals("FizzBuzz",FizzBuzz.fBuzz(15));
    
  }
  
  @Test
  public void exceptionTest() {
      Exception exception = assertThrows(RuntimeException.class, () -> {
        FizzBuzz.fBuzz(-50000);
    });
   
      String expectedMessage = "Please provide valid input between 1 and n";
      String actualMessage = exception.getMessage();
   
      assertTrue(actualMessage.contains(expectedMessage));
  }

}
