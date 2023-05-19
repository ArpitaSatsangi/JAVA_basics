class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int a = 3;
        char x = 'c';
        double d = 43.87;
        long l = 1090;
        
        
        String name = "NanCy";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        
        System.out.println("\n\n");
        
        String food = "Pizza...";
        addExclamationMark(food);
        
        String exc = returnExclamationMark("BuRgeR");
        System.out.println(exc);
        
    }
    
    public static void addExclamationMark(String s)
    {
        System.out.println(s + "!");
    }
    
    public static String returnExclamationMark(String s)
    {
        return s + "!";
    }
    
}

//______OUTPUT________
// Hello, World!
//NanCy
//NANCY
//nancy
//
//
//
//Pizza...!
//BuRgeR!






