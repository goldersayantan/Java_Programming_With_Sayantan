import java.util.Scanner;
import java.io.IOException;

// Single Level Inheritance
class Fruit {
    void fruitInfo()    {
        System.out.println("This is a normal fruit");
    }
}

class Grape extends Fruit   {
    void grapeInfo() {
        System.out.println("This is grape");
    }
}

// Multi Level Inheritance
class Vehicle   {
    void vehicleInfo()    {
        System.out.println("This is a normal vehicle");
    }
}

class Car extends Vehicle{
    void carInfo() {
        System.out.println("This is car");
    }
}

class SportsCar extends Car  {
    void sportCarinfo()    {
        System.out.println("This is sports car");
    }
}

// Hierarchical Inheritance
class Shape {
    void shapeInfo()    {
        System.out.println("This is a normal shape");
    }
}

class Circle extends Shape {
    void circleInfo()   {
        System.out.println("This is circle.");
    }
}

class Rectangle extends Shape {
    void rectangleInfo()    {
        System.out.println("This is rectangle.");
    }
}

// hybrid Inheritance
interface printable {
    void print();
}

class Document {
    void documentInfo()    {
        System.out.println("This is document");
    }
}

class Report extends Document implements printable {
    public void print()    {
        System.out.println("Print the report.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try {
            while(true) {
                int choice;
                System.out.println("Welcome to the Inheritance classroom");
                System.out.println("1. Single Level inheritance");
                System.out.println("2. Multi Level inheritance");
                System.out.println("3. Hierarchical inheritance");
                System.out.println("4. Hybrid inheritance");
                System.out.println("5. Exit");
                System.out.println("Enter your choice : ");
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice)  {
                    case 1:
                        System.out.println("Single level Inheritance.");
                        Fruit fruit = new Fruit();
                        fruit.fruitInfo();
                        Grape grape = new Grape();
                        grape.grapeInfo();
                        break;
                    case 2:
                        System.out.println("Multi Level Inheritance.");
                        Vehicle vehicle = new Vehicle();
                        vehicle.vehicleInfo();
                        Car car = new Car();
                        car.carInfo();
                        SportsCar sportscar = new SportsCar();
                        sportscar.sportCarinfo();
                        break;
                    case 3:
                        System.out.println("Hierarchical inheritance.");
                        Shape shape = new Shape();
                        shape.shapeInfo();
                        Circle circle = new Circle();
                        circle.circleInfo();
                        Rectangle rectangle = new Rectangle();
                        rectangle.rectangleInfo();
                        break;
                    case 4:
                        System.out.println("Hybrid Inheritance.");
                        Document document = new Document();
                        document.documentInfo();
                        Report report = new Report();
                        report.print();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        }catch(Exception e) {
            System.out.println("Error : " + e);
        }
    }
}