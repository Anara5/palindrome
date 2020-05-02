package palindrome;

import java.util.ArrayList;
import java.util.Collections;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        final var characters = new ArrayList<Character>();
        final var charactersReversed = new ArrayList<Character>();

        for(char c : word.toCharArray()){
            characters.add(c);
            charactersReversed.add(c);
        }
        Collections.reverse(charactersReversed);

        return characters.equals(charactersReversed);
    }


    public static boolean isPalindrome(int number) {
        final var word = Integer.toString(number);
        return isPalindrome(word);
    }
}
