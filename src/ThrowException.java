import java.io.IOException;

public class ThrowException {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be greater than 18");
        }else {
            System.out.println("You are adult");
        }
    }

    public static void main(String[] args) {
        checkAge(4);
    }
}