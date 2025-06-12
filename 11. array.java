import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    
        String[] color = {"red", "yellow" , "green"};
        System.out.println(color[1]);
        color[1] = "blue";
        System.out.println(color[1]);
        
        
        String[] cars = new String[3];
        cars[0] = "BMW";
        cars[1] = "Tesla";
        cars[2] = "Audi";
        System.out.println(cars[0]);
        
        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }




        int[][] arr = new int[2][2];
        
        arr[0][0] = 20;
        arr[0][1] = 40;
        arr[1][0] = 60;
        arr[1][1] = 80;
        
        for(int i=0; i<arr.length; i++) {
            System.out.println();
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }




        int[][] nums = {{33,34}, {54,55}};
        
        for(int i=0; i<nums.length; i++) {
            System.out.println();
            for(int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }
        
    }
}


