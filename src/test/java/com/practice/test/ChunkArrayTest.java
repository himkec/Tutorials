package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.practice.ChunkArray;

public class ChunkArrayTest {
  
  
  @Test
  public void exceptionTest() {
      Exception exception = assertThrows(RuntimeException.class, () -> {
        ChunkArray.chunk(null, -5);
    });
   
      String expectedMessage = "Please provide valid input";
      String actualMessage = exception.getMessage();
   
      assertTrue(actualMessage.contains(expectedMessage));
  }

}
