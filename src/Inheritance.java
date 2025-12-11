import java.util.Scanner;

// Single Level Inheritance
class A{
    int a;
    A(int i)    {
        a = i;
        System.out.println(a);
    }
}

class B extends A{
    int b;
    B(int i, int j) {
        super(i);
        b = j;
        System.out.println(b);
    }
}

// Multi Level Inheritance
class C extends B{
    int c;
    C(int i, int j, int k)  {
        super(i, j);
        c = k;
        System.out.println(c);
    }
}

// Hierarchical Inheritance
class D extends B{
    int d;
    D(int i, int j, int k) {
        super(i, j);
        d = k;
        System.out.println(d);
    }
}

interface E{
    void printMessage();
}

// Hybrid Inheritance
class F extends C implements E{
    int f;
    F(int i, int j, int k, int l)   {
        super(i, j, k);
        f = l;
        System.out.println(l);
    }
    public void printMessage()  {
        System.out.println("Hybrid Inheritance printed.");
    }
}

class Inheritance {
    public static void main(String[] args)  {
        while(true) {
            System.out.println("-----Main Menu-----");
            System.out.println("1. Single Level Inheritance.");
            System.out.println("2. Multi Level Inheritance.");
            System.out.println("3. Hierarchical Inheritance.");
            System.out.println("4. Hybrid Inheritance.");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice)  {
                case 1:
                    System.out.print("Enter the first number : ");
                    int x1 = sc.nextInt();
                    System.out.print("Enter the second number : ");
                    int y1 = sc.nextInt();
                    B obj1 = new B(x1, y1);
                    System.out.println("Single Level Inheritance Executed. Class B inherits from class A");
                    break;

                case 2:
                    System.out.print("Enter the first number : ");
                    int x2 = sc.nextInt();
                    System.out.print("Enter the second number : ");
                    int y2 = sc.nextInt();
                    System.out.print("Enter the third number : ");
                    int z2 = sc.nextInt();
                    C obj2 = new C(x2, y2, z2);
                    System.out.println("Multi Level Inheritance Executed. Class C inherits from class B and B inherits from class A");
                    break;

                case 3:
                    System.out.print("Enter the first number : ");
                    int x3 = sc.nextInt();
                    System.out.print("Enter the second number : ");
                    int y3 = sc.nextInt();
                    System.out.print("Enter the third number : ");
                    int z3 = sc.nextInt();
                    D obj3 = new D(x3, y3, z3);
                    System.out.println("Hierarchical Inheritance Executed. Class D inherits from class B and B inherits from class A");
                    break;

                case 4:
                    System.out.print("Enter the first number : ");
                    int w4 = sc.nextInt();
                    System.out.print("Enter the second number : ");
                    int x4 = sc.nextInt();
                    System.out.print("Enter the third number : ");
                    int y4 = sc.nextInt();
                    System.out.print("Enter the forth number : ");
                    int z4 = sc.nextInt();
                    F obj4 = new F(w4, x4, y4, z4);
                    obj4.printMessage();
                    System.out.println("Hybrid Inheritance Executed. Class F implements class E.");
                    break;

                case 5:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");

            }
        }
    }
}