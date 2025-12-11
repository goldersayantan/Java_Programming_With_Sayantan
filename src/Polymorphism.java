// Compile Time Polymorphism
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c)    {
        return a + b + c;
    }
}

// Runtime Polymorphism
class Fruit {
    void taste()    {
        System.out.println("The fruit tastes sweet.");
    }
}

class Grape extends Fruit {
    void taste()    {
        System.out.println("The grapes taste sour.");
    }
}

class Polymorphism {
    public static void main(String[] args)  {
        MathOperations m = new MathOperations();
        int a = 5;
        int b = 10;
        int c = 20;
        System.out.println("The addition of " + a + " + " + b + " = " + m.add(a, b));
        System.out.println("The addition of " + a + " + " + b + " + " + c + " = " + m.add(a, b, c));

        Grape g = new Grape();
        g.taste();
    }
}