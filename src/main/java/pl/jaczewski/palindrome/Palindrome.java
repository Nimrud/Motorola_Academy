package pl.jaczewski.palindrome;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalidrome(" kaj \t \n  ak\n "));
    }

    public boolean isPalidrome(String input) {
        if (input == null) {
            throw new NullPointerException("Wprowadź wyrażenie (nie może być puste)");
        }

        String trimmedInput = input.trim().toLowerCase(Locale.ROOT);
        String signsRemoved = trimmedInput.replaceAll("\\s+", "");
        System.out.println("signsRemoved: " + signsRemoved);

//        // usuwanie spacji ze środka stringa:
//        String[] trimmedInput2 = trimmedInput.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String s : trimmedInput2) {
//            sb.append(s);
//
//        }
//        String stringRebuilt = sb.toString();
//        System.out.println("reb: " + stringRebuilt);

        char[] inputChars = signsRemoved.toCharArray();
        char[] outputChars = new char[inputChars.length];

        for (int i = 0; i < inputChars.length; i++) {
            outputChars[outputChars.length-i-1] = inputChars[i];
        }
        return Arrays.toString(outputChars).equals(Arrays.toString(inputChars));
    }
}
