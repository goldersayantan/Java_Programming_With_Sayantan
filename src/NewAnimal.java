class NewAnimal    {
    void sound()    {
        System.out.println("The animal barks");
    }
}

class NewDog extends NewAnimal    {
    void eat()  {
        System.out.println("The dog eats");
    }

    public static void main(String[] args)  {
        NewDog d = new NewDog();
        d.eat();
        d.sound();
    }
}