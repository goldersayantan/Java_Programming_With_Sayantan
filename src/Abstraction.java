abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound()    {
        System.out.print("Dog Barks");
    }
}

public class Abstraction{
    public static void main(String[] args)  {
        Animal d = new Dog();
        d.sound();
    }

}
