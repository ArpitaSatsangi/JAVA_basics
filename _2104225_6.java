import java.util.Scanner;

public class _2104225_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String input = sc.nextLine().trim();
        char unit = Character.toUpperCase(input.charAt(0));
        double temperature = Double.parseDouble(input.substring(2));
        if (unit == 'C') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.1f\n", fahrenheit);
        } else if (unit == 'F') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.1f\n", celsius);
        } else {
            System.out.println("Invalid input! Please enter a valid temperature followed by C or F.");
        }
        sc.close();
    }
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
        
    }
}


/*
 Assignment 6: Write a Java program that converts temperatures between Celsius and
Fahrenheit using wrapper classes and appropriate conversion formulas.

Example Input: C 37
Expected Output: 98.6

Example Input: F 98.6
Expected Output: 37.0
Note that input and output should have only one significant place after decimal.
*/