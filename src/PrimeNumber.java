import java.util.*;

class PrimeNumber   {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = false;
        for(int i = 2; i <= num / 2; i++)   {
            if(num % i == 0)    {
                isPrime = false;
                break;
            }else {
                isPrime = true;
            }
        }
        if(isPrime) {
            System.out.println("The number " + num + " is a prime number.");
        }else {
            System.out.println("The number " + num + " is not a prime number.");
        }
    }
}
