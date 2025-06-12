import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;
        
        double max = Math.max(x,y);
        double min = Math.min(x,y);
        
        System.out.println("max " + max + "     min " + min); 
        //max 3.14     min -10.0

        
        System.out.println("Absolute of y = " + Math.abs(y));
        // Absolute of y = 10.0
        
        System.out.println("sqrt " + Math.sqrt(49)); // sqrt 7.0
        
        System.out.println("round " + Math.round(x)); // round 3
        
        System.out.println("ceil=" + Math.ceil(x) + " floor=" + Math.floor(x)); // ceil=4.0 floor=3.0
        
        
        
        // -------------------- Hypertenuse -----------------------
        
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextDouble();
        
        System.out.println("Enter b");
        b = sc.nextDouble();
        
        c = Math.sqrt((a*a) + (b*b));
        
        System.out.println("Hypertenuse is " + c);
        
        sc.close();
    }
}
