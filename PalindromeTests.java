import org.junit.jupiter.api.Test;
import palindrome.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTests {
    @Test
    void annaIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("anna"));
    }

    @Test
    void johnIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("john"));
    }

    @Test
    void two002IsPalindrome() {
        assertTrue(Palindrome.isPalindrome(2002));
    }

    @Test
    void two123IsPalindrome() {
        assertFalse(Palindrome.isPalindrome(123));
    }
}