import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        System.out.printf("this is format string %d\n",123);
        System.out.printf("%f this is format string\n", 56.7);
        System.out.printf("this is %d format string\n", 984);
        
        
        boolean bool = true;
        char ch = '@';
        int i = 43;
        double d = 1234.34985;
        
        System.out.printf("%b  ", bool);
        System.out.printf("%c  ", ch);
        System.out.printf("%d  ", i);
        System.out.printf("%f\n", d); // true  @  43  1234.349850
        
        
        
        String str = "Bro";
        // width: + for space on left , - for space on right
        System.out.printf("Hello %10s\n",str); // "Hello        Bro"
        System.out.printf("Hello %-10s\n",str); // "Hello Bro       "
        
        
        
        // precision
        System.out.printf("with 2 precision: %.2f\n", d); // with 2 precision: 34.35
        
        
        
        
        // flags
        System.out.printf("plus sign: %+f\n", d); // plus sign: +1234.349850
        System.out.printf("padded with zero: %020f\n", d); // padded with zero: 0000000001234.349850
        
        System.out.printf("comma: %,f", d); // comma: 1,234.349850
    }
}
