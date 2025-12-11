import java.util.*;

class BinomialCoefficient {

    public static int factorial(int num)    {
        int fact = 1;
        for(int i = num; i > 0; i--)    {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        float result = (float)factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("The result of binomial coefficient of " + n + "C" + r + " will be : " + result);
    }
}