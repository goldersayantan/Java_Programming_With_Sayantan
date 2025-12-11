import java.util.*;

class DecimalToBinary {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int dec_num = sc.nextInt();
        int temp = dec_num;
        int binary_num = 0, placeval = 1;
        while(temp != 0)    {
            int digit = temp % 2;
            binary_num += digit * placeval;
            placeval *= 10;
            temp /= 2;
        }
        System.out.print("The binary number equivalent to " + dec_num + " is : " + binary_num);
    }
}