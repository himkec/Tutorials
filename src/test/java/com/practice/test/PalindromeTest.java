package com.practice.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import com.practice.Palindrome;
import com.practice.StringReverse;

public class PalindromeTest {
  
  private final Palindrome plr = new Palindrome();
  
  @ParameterizedTest
  @ValueSource(strings = { "Hi!", 
                           "Heelow", 
                           "asas",
                           })
  public void palindromeNegativeTest(String input) {
    assertFalse(plr.isPalindrome(input));
  }
  
  @ParameterizedTest
  @ValueSource(strings = { "racecar", 
                           "radar", 
                           "able was I ere I saw elba",
                           ""
                           })
  public void palindromePositiveTest(String input) {
    assertTrue(plr.isPalindrome(input));
  }

}
