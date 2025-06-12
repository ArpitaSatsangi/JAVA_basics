class Main {
    public static void main(String[] args) {
        
        int age = 80;
        
        if(age >= 75) {
            System.out.println("Old");
        }
        else if(age >= 18) {
            System.out.println("Adult");
        }
        else if(age == 0) {
            System.out.println("Newborn");
        }
        else {
            System.out.println("Not adult");
        }
    }
}
