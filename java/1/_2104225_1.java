import java.util.Scanner;

public class _2104225_1 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        String str,str1,str2,uppercase1,uppercase2,Result;
        int len1,len2,index;
        //"Enter a string:
        str=sc.nextLine();
        
        len1=str.length();
        uppercase1=str.toUpperCase();
        
        index=uppercase1.indexOf(" ");
        str1=uppercase1.substring(0,index);
        str2=uppercase1.substring(index,len1);
        
        uppercase2=str2.toUpperCase();
        
        len2 = (str.length() - str1.length())-1; //only main string
        
        boolean result=str2.contains(str1);
        if(result==true)
        {
            Result="Substring Found";
        }
        else
        {
            Result="Substring Not Found";
        }
        System.out.println(len2+uppercase2+" "+Result);
       
    }
    
}

/*
 Write a Java program that takes a string input from the user and performs the following operations:
   Print the length of the string.
   Convert the string to uppercase.
   Check if the string contains a specific substring (case-insensitive).
Assume that the first word of the input is the substring to search
for, and that the remaining words are all part of the input string.

Example:
Input: world Hello, World!
Output: 13 HELLO, WORLD! Substring Found

Input: wold Hello, World!
Output: 13 HELLO, WORLD! Substring Not Found

Explanation:
Length: 13
Uppercase: "HELLO, WORLD!"
Contains substring "world": Substring Found
 */
