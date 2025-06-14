
class Main {
    public static void main(String[] args) {
        
        Car myCar1 = new Car("BMW", "white", 50000.00);
        
        System.out.println(myCar1.model);
        System.out.println(myCar1.color);
        System.out.println(myCar1.price);
        myCar1.drive();
        myCar1.brakes();
        System.out.println();
        
        
        Car myCar2 = new Car("Audi", 2025, "Black", 70999.99);
        
        System.out.println(myCar2.model);
        System.out.println(myCar2.year);
        System.out.println(myCar2.color);
        System.out.println(myCar2.price);
        myCar2.drive();
        myCar2.brakes();
        
    }
}

class Car {
    
    String model;
    int year;
    String color;
    double price;
    
    Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    
    Car(String model, int year, String color, double price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    
    void drive() {
        System.out.println("Driving " + this.model + ".....");
    }
    
    void brakes() {
        System.out.println("Brakesss on " + this.model + "!!");
    }
    
}

