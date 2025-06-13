import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String name="";
        while(name.isBlank()) {
            System.out.println("Enter name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello " + name);
        
        
        
        String color="";
        do {
            System.out.println("Enter fav color: ");
            color = sc.nextLine();
        } while(color.isBlank());
        System.out.println("Fav color " + color);

      

        for(int i=0; i<5; i++)  {
            System.out.println(i);
        }



        for(int i=0; i<4; i++)  {
            System.out.println();
            for(int j=0; j<6; j++) {
                System.out.print("#");
            }
        }




        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        
        for(int i:nums1) {
            System.out.println(i);
        }
      
    }
}
