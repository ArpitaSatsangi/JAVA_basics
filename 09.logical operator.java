import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        int temp = 40;
        
        if(temp >= 20 && temp <= 30) {
            System.out.println("Warm");
        }
        else if(temp < -273 || temp > 273){
            System.out.println("Impossible");
        }
        else if(temp != 50) {
            System.out.println("Not 40");
        }
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("type y or Y for yes");
        String s = sc.next();
        if(s.equals("Y") || s.equals("y")) {
            System.out.println("yes");
        }
        else if(!s.equals("Y") || !s.equals("y")) {
            System.out.println("idk");
        }
        
    }
}
