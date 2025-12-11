import java.util.*;

class calculation   {
    int num1;
    int num2;

    calculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int addition() {
        return num1 + num2;
    }

    int substraction() {
        return num1 - num2;
    }

    int multiplication() {
        return num1 * num2;
    }

    int division()  {
        return num1 / num2;
    }
}

public class calculationClass {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        calculation cal1 = new calculation(num1, num2);
        System.out.println("The addition of " + num1 + " and " + num2 + " will be : " + cal1.addition());
        System.out.println("The substraction of " + num1 + " and " + num2 + " will be : " + cal1.substraction());
        System.out.println("The multiplication of " + num1 + " and " + num2 + " will be : " + cal1.multiplication());
        System.out.println("The division of " + num1 + " and " + num2 + " will be : " + cal1.division());
    }
}
