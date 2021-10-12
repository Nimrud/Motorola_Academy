package pl.jaczewski;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.jaczewski.palindrome.Palindrome;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PalindromeTests {

    Palindrome palindrome = new Palindrome();

    @Test
    public void should_produce_true_when_kajak_given() {
        assertEquals(true, palindrome.isPalidrome("kajak"));
    }

    @Test
    public void should_produce_true_when_kAjak_given() {
        assertEquals(true, palindrome.isPalidrome("kAjak"));
    }

    @Test
    public void should_produce_true_when_space_in_string() {
        assertEquals(true, palindrome.isPalidrome("kajak "));
    }

    @Test
    public void should_produce_true_when_empty_string() {
        assertEquals(true, palindrome.isPalidrome(""));
    }

    @Test
    public void should_produce_false_when_not_palindrome() {
        assertEquals(false, palindrome.isPalidrome(String.valueOf(1432)));
    }

    @Test
    public void should_produce_true_when_whitespaces() {
        assertEquals(true, palindrome.isPalidrome("\n \t"));
    }

    @Test
    public void should_produce_true_when_spaces_inside() {
        assertEquals(true, palindrome.isPalidrome("kaj ak"));
    }
}
