import java.util.*;

class fibonacciSeries {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of the numbers you want : ");
        int limit = sc.nextInt();
        int temp1 = 0, temp2 = 1, backup1;
        for(int i = 0; i < limit; i++)  {
            System.out.print(temp1 + " ");
            backup1 = temp1;
            temp1 = temp1 + temp2;
            temp2 = backup1;
        }
        System.out.println();

        System.out.print("Enter the starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number : ");
        int end = sc.nextInt();
        int temp3 = 0, temp4 = 1, backup2;
        while(temp3 <= end) {
            backup2 = temp3;
            temp3 = temp3 + temp4;
            temp4 = backup2;
            if(temp3 >= start && temp3 <= end)  {
                System.out.print(temp3 + " ");
            }
        }
    }
}