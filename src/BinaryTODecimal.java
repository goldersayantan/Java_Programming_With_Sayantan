import java.util.*;

class BinaryTODecimal {
    public static boolean isBianry(int num) {
        while(num != 0) {
            int digit = num % 10;
            if((digit != 0) && (digit != 1))    {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int bin_num = sc.nextInt();
        int temp = bin_num;
        int dec_num = 0, count = 0;
        if(isBianry(bin_num))   {
            while(temp != 0)    {
                int digit = temp % 10;
                dec_num += digit * (int)Math.pow(2, count);
                temp /= 10;
                count++;
            }
            System.out.println("The decimal number equivalent to binary number " + bin_num + " will be : " + dec_num);
        }else   {
            System.out.println("This " + bin_num + " is not a binary number.");
        }
    }
}
