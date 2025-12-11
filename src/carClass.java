class Car   {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start()    {
        System.out.println(brand + " is starting. ");
    }

    void displayInfo()  {
        System.out.println(year + ", " + brand);
    }
}

public class carClass {
    public static void main(String[] args)   {
        Car car1 = new Car("Toyota", 2025);
        Car car2 = new Car("BMW", 2024);

        car1.start();
        car1.displayInfo();

        car2.start();
        car2.displayInfo();
    }
}

