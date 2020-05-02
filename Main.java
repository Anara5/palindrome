package palindrome;

import java.util.Scanner;

import static palindrome.Palindrome.isPalindrome;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a palindrome number or string");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.nextLine();
            if (word.equals("q")) break;
            if (isPalindrome(word))
                System.out.println(word + " is palindrome");
            else
                System.out.println(word + " is not a palindrome");

        }
    }
}
