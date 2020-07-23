package com.practice.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import com.practice.Palindrome;
public class PalindromeTest {
  
  @ParameterizedTest
  @ValueSource(strings = { "Hi!", 
                           "Heelow", 
                           "asas",
                           })
  public void palindromeNegativeTest(String input) {
    assertFalse(Palindrome.isPalindrome(input));
  }
  
  @ParameterizedTest
  @ValueSource(strings = { "racecar", 
                           "radar", 
                           "able was I ere I saw elba",
                           ""
                           })
  public void palindromePositiveTest(String input) {
    assertTrue(Palindrome.isPalindrome(input));
  }
}
