package com.practice.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.practice.MaxChar;

/**
 * 
 * @author bishth
 * 
 * Given the String, return the character thats most common
 *
 */
public class MaxCharTest {
  @Test
   public void maxCharTest() {
     assertEquals('H',MaxChar.mostCommon("HI"));
     assertEquals('I',MaxChar.mostCommon("HIIIII"));
     assertEquals('2',MaxChar.mostCommon("11112222222222fsfsdf"));
   }
  
  @Test
  public void exceptionTest() {
      Exception exception = assertThrows(RuntimeException.class, () -> {
        MaxChar.mostCommon("");
    });
   
      String expectedMessage = "Please provide valid input";
      String actualMessage = exception.getMessage();
   
      assertTrue(actualMessage.contains(expectedMessage));
  }
}
