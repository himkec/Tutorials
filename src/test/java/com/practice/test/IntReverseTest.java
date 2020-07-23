package com.practice.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.practice.IntReverse;

public class IntReverseTest {
  
 @Test
  public void intReverseTest() {
    assertEquals(1,IntReverse.reverseInt(10));
    assertEquals(1,IntReverse.reverseInt(100));
    assertEquals(54321,IntReverse.reverseInt(12345));
    assertEquals(5,IntReverse.reverseInt(5)); 
    assertEquals(-5,IntReverse.reverseInt(-5)); 
    assertEquals(-12345,IntReverse.reverseInt(-54321)); 
  }
}
