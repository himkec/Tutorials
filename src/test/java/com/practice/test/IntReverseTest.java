package com.practice.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.practice.IntReverse;

public class IntReverseTest {
  
  private final IntReverse str = new IntReverse();
  
 @Test
  public void intReverseTest() {
    assertEquals(1,str.reverseInt(10));
    assertEquals(1,str.reverseInt(100));
    assertEquals(54321,str.reverseInt(12345));
    assertEquals(5,str.reverseInt(5)); 
    assertEquals(-5,str.reverseInt(-5)); 
    assertEquals(-12345,str.reverseInt(-54321)); 
  }
}
