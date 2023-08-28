import java.util.Scanner;
public class a2_2104225 {
    
    public static int MaxNumberCoins(int n) 
    {
        int coins = 0;
        while (n>0 && n != 1) 
        {
            if (n % 2 == 0) 
            {
                n /= 2;
            } 
            else 
            {
                n=n+(n*2)+1;
            }
            coins++;
        }
        return coins;
    }

    
    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        
        //there are four inputs
        
        for(int i=0; i<4;i++)
        {
            //Enter the value of X: 
            int X = sc.nextInt();
            
            int maxCoins = Integer.MIN_VALUE;        
            for (int j = 1; j <= X; j++) 
            {
                maxCoins = Math.max(maxCoins, MaxNumberCoins(j));
            }

            System.out.println(maxCoins);

        }
        
    }
}
