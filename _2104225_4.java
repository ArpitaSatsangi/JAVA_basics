import java.util.Scanner;
import java.util.Arrays;
class _2104225_4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        
        //considering the number of elements of the array as 5  
        int[] arr = new int[5];  
   
        //Enter the elements of the array: 
        for(int i=0; i<arr.length; i++)  
        {  
            arr[i]=sc.nextInt();  
        } 
        Arrays.sort(arr);
        for (int i = 0; i <  arr.length; i++)   
        {       
            System.out.print(arr[i] + " ");   
        }   
        
    }
}

/*
 Assignment 4: Write a Java program that takes a list of space separated integers from
the user, sorts them in ascending order using the java.util.Arrays package, and
then prints the sorted list.

Example:
Input: 9, 2, 5, 1, 7
Output: 1, 2, 5, 7, 9
 */
