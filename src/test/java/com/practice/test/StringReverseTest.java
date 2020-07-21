package com.practice.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import com.practice.StringReverse;

public class StringReverseTest {
  
  private final StringReverse str = new StringReverse();
  
  @ParameterizedTest
  @ValueSource(strings = { "racecar", 
                           "radar", 
                           "able was I ere I saw elba",
                           "Hi!",
                           ""
                           })
  public void stringReverseTest(String input) {
    StringBuilder out=new StringBuilder(input);
    assertEquals(str.reverseString(input),out.reverse().toString());
  }

}
