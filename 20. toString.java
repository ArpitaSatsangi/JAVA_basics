
class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("Audi", 2025, "Black", 70999.99);
        
        System.out.println(myCar.toString());
     
    }
}

class Car {
    
    String model;
    int year;
    String color;
    double price;
    
    Car(String model, int year, String color, double price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    
    public String toString() {
        return this.model + "\n" + this.year + "\n" + this.color + "\n" + this.price;
    }
    
}

