interface Animal {
    void sound();
}

class Mammal {
    String type;

    Mammal(String type) {
        this.type = type;
    }

    void displayType()  {
        System.out.println("Type : " + type);
    }
}

class Dog extends Mammal implements Animal {
    String name;
    Dog(String name)   {
        super("Dog");
        this.name = name;
    }

    public void sound()    {
        System.out.println("Bark");
    }

    void displayName()  {
        System.out.println("Name : " + name);
        displayType();
    }

    public static void main(String[] args)  {
        Dog dog = new Dog("Buddy");
        dog.sound();
        dog.displayName();
    }
}
