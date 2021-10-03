package pl.jaczewski.string_modify;

import java.util.Locale;

public class RegeneratingString {
    // the starting state should be "000111"
    private String oldString = "000111";
    private String newString = "";

    /**
     * Name: removeSingleAt
     * Removes a single character at a given index.
     * That single character is replaced according to the rules
     * given in the instructions.
     *
     * You can assume the index will be in bounds.
     *
     * @param index   the index of the character to be removed
     */
    public String removeSingleAt(int index) {
        char[] oldChars = oldString.toCharArray();

        if(oldChars[index] == '1') {

            char[] newChar = new char[oldChars.length+1];

            for (int i = 0; i < newChar.length; i++) {
                if (i < index) {
                    newChar[i] = oldChars[i];
                } else if (i == index) {
                    newChar[i] = '1';
                    newChar[i + 1] = '1';
                } else if(i < (newChar.length - 1)) {
                    newChar[i+1] = oldChars[i];
                } else {
                    newChar[i] = oldChars[i-1];
                }
            }
            newString = String.valueOf(newChar);
            return newString;
        } else if(oldChars[index] == '0') {
            oldChars[index] = '0';
        } else {

        }
        newString = String.valueOf(oldChars);
        return newString;
    }

    /**
     * Name: removeDoubleAt
     * Removes two adjacent characters starting at a given index.
     * That double characters are replaced according to the rules
     * given in the instructions:
     * "00" => ""
     * "11" => "0"
     *
     * You can assume the index will be in bounds...but what will
     * you do if the index is the *last* index I wonder?....
     *
     * @param index   the index of the first of the two characters to be removed
     */
    public String removeDoubleAt(int index) {
        char[] oldChars = oldString.toCharArray();

        if (index == oldChars.length-1) {
            newString = oldString;
        } else if (oldChars[index] == '1' && oldChars[index+1] == '1') {
            String preservePrev = oldString.substring(0, index);
            String preserveAfter = oldString.substring(index+2);
            newString = preservePrev + "0" + preserveAfter;
        } else if (oldChars[index] == '0' && oldChars[index+1] == '0') {
            if (index == 0) {
                newString = oldString.substring(index+2);
            } else {
                String preservePrev = oldString.substring(0, index);
                String preserveAfter = oldString.substring(index+2);
                newString = preservePrev + preserveAfter;
            }
        } else {
            newString = oldString;
        }
        return newString;
    }

    /**
     * Name: toString
     * Returns the current state of this regenerating String.
     *
     * @return   the current state of this regenerating String
     */

    @Override
    public String toString() {
        return newString;
    }
}
