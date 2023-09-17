// ~~Employee Management System~~ 

class Employee {
    
    //atributes:-
    private int id;
    private String name;
    private double salary;

    //methods:-
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID is :  " + id);
        System.out.println("Employee Name is :  " + name);
        System.out.println("Employee Salary is :  ₹" + salary);
    }
}

class Manager extends Employee {
    
    //additional attribute
    private String department;

    //additional method
    public String getDepartment() {
        return department;
    }
    
    
    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department is :  " + department);
    }
}

class Developer extends Employee {
    
    //additional attribute 
    private String programmingLanguage;

    //additional method
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    
    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language is :  " + programmingLanguage);
    }
}

class Tester extends Employee {
    
    //additional attribute
    private String testingType;

    //additional method
    public String getTestingType() {
        return testingType;
    }
    
    
    public Tester(int id, String name, double salary, String testingType) {
        super(id, name, salary);
        this.testingType = testingType;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Testing Type is :  " + testingType);
    }
}

public class _2104225_Asg5 {

    public static void main(String[] args) {
        
        Manager m = new Manager(2301011, "Manager Rishabh Singh", 50000, "Finance");
        Developer d = new Developer(2302012, "Developer Shreya Sah", 100000, "C++");
        Tester t = new Tester(2303013, "Tester Mohit Verma", 75000, "Software Performance Testing");

        m.displayInfo();
        System.out.println();

        d.displayInfo();
        System.out.println();

        t.displayInfo();
        System.out.println("\n\n");
        
        
        // Demonstrating polymorphism:-
        Employee[] arr = new Employee[3];
        arr[0] = m; //Manager
        arr[1] = d; //Developer
        arr[2] = t; //Tester

        for (Employee element : arr) {
            element.displayInfo();
            System.out.println();
        }
    } 
}

