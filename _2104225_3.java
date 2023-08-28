import java.util.Scanner;

public class _2104225_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        //Enter the sentence:
        String str = sc.nextLine();
        
        
        int len = str.length();
       
        String[] words = str.split("\\s+");
        int number_of_words = words.length;
        
        
        len = len - number_of_words+1; 
        
        System.out.println(len*number_of_words);
        
 
    }
      
}

/*
Assignment 3: Write a Java program that takes a sentence input from the user and prints
the product of the number of words and the number of non-space characters in the
sentence.

Example:
Input: Java programming is fun
Output: 80

Explanation: 4 words, 20 characters (excluding
spaces)

 */
