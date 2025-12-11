import java.util.Scanner;
public class Person    {
    String name;
    int age;

    Person(String name, int age)   {
        this.name = name;
        this.age = age;
    }

    void display()  {
        System.out.println("Name : " + name + " Age : " + age);
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        Person p1 = new Person(name, age);
        p1.display();
    }
}