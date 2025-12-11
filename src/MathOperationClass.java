//Member Method Overloading
//
//Create a class MathOperation with methods add:
//Add two integers.
//Add three integers.
//Add two doubles.

public class MathOperationClass {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperationClass m = new MathOperationClass();

        System.out.println("Sum of 2 integers: " + m.add(5, 10));
        System.out.println("Sum of 3 integers: " + m.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + m.add(5.5, 10.3));
    }
}
