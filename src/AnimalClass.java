//Explanation:
//• Animal class has a method eat.
//• Dog class inherits from Animal and adds a method bark.
//• In the main method, we create a Dog object and call both eat and bark methods.

public class AnimalClass {
    void eat() {
        System.out.println("The dog eats.");
    }
}

class Dog extends AnimalClass   {
    void bark() {
        System.out.println("The dogs bark.");
    }

    public static void main(String[] args)   {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
