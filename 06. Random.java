import java.util.Random;

class Main {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int x = random.nextInt();
        System.out.println("x=" + x); // x=451509346
        
        
        int y = random.nextInt(6); // 0,1,2,3,4,5
        System.out.println("y=" + y); // y=3
        
        
        double z = random.nextDouble();
        System.out.println("z="+z); // z=0.5156326026823377

        
        boolean flag = random.nextBoolean();
        System.out.println("Flag="+flag); // Flag=false

        
    }
}
