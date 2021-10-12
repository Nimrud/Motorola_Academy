package pl.jaczewski.palindrome;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalidrome("kaj ak"));
    }

    public boolean isPalidrome(String input) {
        if (input == null) {
            throw new NullPointerException("nie może być nullem");
        }

        String trimmedInput = input.trim().toLowerCase(Locale.ROOT);

        // usuwanie spacji ze środka stringa:
        String[] trimmedInput2 = trimmedInput.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : trimmedInput2) {
            sb.append(s);

        }
        String stringRebuilt = sb.toString();

        char[] inputChars = stringRebuilt.toCharArray();
        char[] outputChars = new char[inputChars.length];

        for (int i = 0; i < inputChars.length; i++) {
            outputChars[outputChars.length-i-1] = inputChars[i];
        }
        return Arrays.toString(outputChars).equals(Arrays.toString(inputChars));
    }
}
