import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Name? ");
        String name = scanner.nextLine();
        System.out.print("Age? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clear the \n in the scanner because of nextInt and thus now we can easily use nextLine after this without any problem
        System.out.print("Fav food? ");
        String food = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Fav food " + food);
        
    }
}

// ---------------------------------------------------------- //

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
