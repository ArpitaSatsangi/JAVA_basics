
class Main {
    public static void main(String[] args) {
        
        Car[] myCollections = new Car[3];
        
        Car myCar1 = new Car("Audi", 2005, "Black", 7999.99);
        Car myCar2 = new Car("BMW", 2020, "White", 21999.99);
        Car myCar3 = new Car("Lamborghini", 2025, "Blue", 49343.49);
        
        myCollections[0] = myCar1;
        myCollections[1] = myCar2;
        myCollections[2] = myCar3;
        
        for(int i=0; i<myCollections.length; i++) {
            System.out.println(myCollections[i].model);
        }
        
        
        
        
        
        
        Car[] myBroCollections = {myCar1, myCar2, myCar3};
        for(int i=0; i<myCollections.length; i++) {
            System.out.println(myCollections[i].model);
        }
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
}

