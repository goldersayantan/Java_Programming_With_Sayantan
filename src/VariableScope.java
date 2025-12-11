class A {
    int a = 10;
    static int b = 20;
    void show() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int c = 30;
        System.out.println("c: " + c);
    }
}

class VariableScope   {
    public static void main(String[] args)  {
        A object = new A();
        object.show();
    }
}