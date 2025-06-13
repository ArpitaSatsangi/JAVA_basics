class Main {
    public static void main(String[] args) {
    
        String str = "Brother";
        
        boolean res = str.equals("Brother");
        System.out.println(res); // true
        
        boolean res2 = str.equalsIgnoreCase("brother");
        System.out.println(res2); // true
        
        int len = str.length();
        System.out.println(len); // 7
        
        char ch = str.charAt(3);
        System.out.println(ch); // t
        
        int ind = str.indexOf("e");
        System.out.println(ind); // 5
        
        boolean res3 = str.isEmpty();
        System.out.println(res3); // false
        
        String s = str.toUpperCase();
        System.out.println(s); // BROTHER
        
        String s2 = str.toLowerCase();
        System.out.println(s2); // brother
        
        String name = "  Arpi  ";
        String new_name = name.trim();
        System.out.println(new_name); // Arpi
        
        String rep = str.replace('o', 'p');
        System.out.println(rep); // Brpther
        
    } 
}
