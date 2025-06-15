
class Main {
    public static void main(String[] args) {
        
        System.out.println("~~Vehicle class~~");
        Vehicle bus = new Vehicle("bus", 100.00);
        bus.move();
        bus.sound();
        
        System.out.println("~~Car class~~");
        Car car = new Car("car", 60.00, 4);
        car.move();
        car.ac();
        car.sound();
        
        System.out.println("~~Bicycle class~~");
        Bicycle bicycle = new Bicycle("bicycle", 29.99, 2);
        bicycle.move();
        bicycle.pedals();
        bicycle.sound();
    }
}

class Vehicle {
    String type;
    double speed;
    
    Vehicle(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }
    
    void move() {
        System.out.println("Moving with speed "+this.speed); 
    }
    
    void sound() {
        System.out.println("sound..."); 
    }
}

class Bicycle extends Vehicle{
    int pedals;
    
    Bicycle(String type, double speed, int pedals) {
        super(type, speed);
        this.pedals = pedals;
    }
    @Override
    void sound() {
        System.out.println("chi chi..."); 
    }
    
    void pedals () {
        System.out.println(this.pedals + " pedals in my bicycle");
    }
}

class Car extends Vehicle {
    int doors;
    
    Car(String type, double speed, int doors) {
        super(type, speed);
        this.doors = doors;
    }
    
    @Override
    void sound() {
        System.out.println("brom brom..."); 
    }
    
    void ac () {
        System.out.println("good ac in my car with "+ this.doors + " doors");
    }
} 




/*
~~Vehicle class~~
Moving with speed 100.0
sound...
~~Car class~~
Moving with speed 60.0
good ac in my car with 4 doors
brom brom...
~~Bicycle class~~
Moving with speed 29.99
2 pedals in my bicycle
chi chi...
*/
