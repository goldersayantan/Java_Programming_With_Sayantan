import java.util.Scanner;

public class ExceptionHandling  {
    public static void main(String[] args)   {
        try {
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        }catch (ArithmeticException e)    {
            System.out.println("Error occurred! " + e);
        }
    }
}