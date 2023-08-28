import java.util.Scanner;

/*Assignment 2: Write a Java program that takes a date input in the format "yyyy-MM-dd" and converts it to "dd/MM/yyyy" format.

Example:
Input: "2023-07-31"
Output: "31/07/2023"
 */

public class _2104225_2 {
    
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);  
    
         //Enter in the format yyyy-MM-dd:
         String str = sc.next();
       
         String[] parts = str.split("-");
         int year = Integer.parseInt(parts[0]);
         int month = Integer.parseInt(parts[1]);
         int date = Integer.parseInt(parts[2]);

         String outputstr = String.format("%02d/%02d/%04d", date, month, year);
         System.out.println(outputstr);
       
       
     }
}
