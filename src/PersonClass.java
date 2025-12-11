//Explanation:
//• The Person class has two fields: name and age.
//• A constructor initializes these fields.
//• The display method prints the person's details.
//• In the main method, we create an instance of Person and call the display method.

public class PersonClass {
    String name;
    int age;

    PersonClass(String name, int age)   {
        this.name = name;
        this.age = age;
    }

    void displayDetails()   {
        System.out.println("The person's name is : " + name + " and age is : " + age);
    }

    public static void main(String[] args)  {
        PersonClass p1 = new PersonClass("Alex", 18);
        p1.displayDetails();
    }
}
