import java.util.Scanner;

class takingInput {
public static void main(String[] args) {
        
System.out.println("HEYY!");
    
Scanner sc = new Scanner(System.in);     
System.out.print("Enter number 1:  ");      
float a = sc.nextFloat();  
System.out.print("Enter number 2:  ");      
float b = sc.nextFloat();
   
float c= a+b;
System.out.println("The sum of numbers is: ");
System.out.print(c);       
 
  
//String str1 = sc.next(); //word
System.out.println("Enter a sentence:  ");
String str = sc.nextLine();
System.out.println(str); 
     

 }

}
