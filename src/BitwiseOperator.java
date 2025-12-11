import java.util.*;

class BitwiseOperator {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        // Bitwise And
        int bitWiseAnd = num1 & num2;
        System.out.println("The bitwise & result of " + num1 + " & " + num2 + " will be : " + bitWiseAnd);

        // Bitwise Or
        int bitWiseOr = num1 | num2;
        System.out.println("The bitwise | result of " + num1 + " | " + num2 + " will be : " + bitWiseOr);

        // Bitwise Xor
        int bitWiseXor = num1 ^ num2;
        System.out.println("The bitwise ^ result of " + num1 + " ^ " + num2 + " will be : " + bitWiseXor);

        // Bitwise << and >>
        System.out.print("Enter the number : ");
        int num3 = sc.nextInt();
        System.out.print("Enter the index value : ");
        int num4 = sc.nextInt();
        int bitwiseLeft = num3 << num4;
        System.out.println("The result after bitwise left operation of " + num3 + " << " + num4 + " will be : " + bitwiseLeft);
        int bitwiseRight = num3 >> num4;
        System.out.println("The result after bitwise Right operation of " + num3 + " >> " + num4 + " will be : " + bitwiseRight);
    }
}