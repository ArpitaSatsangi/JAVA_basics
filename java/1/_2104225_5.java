
import java.util.Scanner;

public class _2104225_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Enter a string: 
        String input = sc.nextLine();
        
        String newInput = input.replaceAll("\\s+", "").toLowerCase();
        
        boolean isPalindrome = true;
        int len = newInput.length();
        for (int i = 0; i < len / 2; i++) {
            if (newInput.charAt(i) != newInput.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
       
        System.out.println(isPalindrome ? "Yes" : "No");
        
    }
}

/*
Assignment 5: Write a Java program that takes a string input and checks if it is
a palindrome (reads the same forwards and backward). Program prints Yes if
palindrome and No otherwise.

Example:
Input: racecar
Output: Yes

Input: car race
Output: No
 
 */

