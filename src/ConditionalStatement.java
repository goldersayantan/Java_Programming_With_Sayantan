import java.util.*;

class ConditionalStatement  {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 : Hello\nPress 2 : Namaste\nPress 3 : Bonjour");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Hello");
        }else if(choice == 2)   {
            System.out.println("Namaste");
        }else if(choice == 3)   {
            System.out.println("Bonjour");
        }else {
            System.out.println("Invalid Choice.");
        }

        switch(choice)  {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}