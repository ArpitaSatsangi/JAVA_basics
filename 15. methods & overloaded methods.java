import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        hello("Arpi", 4);
        hello("Sata", 8);
    } 
    
    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }
}




// oberloaded methods
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        System.out.println(add(3,4));
        System.out.println(add(80,50,10));
    } 
    
    static int add(int a, int b) {
        System.out.println("Overloaded method 1");
        return a+b;
    }
    
    static int add(int a, int b, int c) {
        System.out.println("Overloaded method 2");
        return a+b+c;
    }
}
