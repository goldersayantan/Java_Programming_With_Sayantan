public class Test{
    int num1;
    int num2;

    void addition() {
        int result = num1 + num2;
        System.out.println("The addition of " + num1 + " and " + num2 + " will be : " + result);
    }
    void subtraction() {
        int result = num1 - num2;
        System.out.println("The subtraction of " + num1 + " and " + num2 + " will be : " + result);
    }
    void multiplication() {
        int result = num1 * num2;
        System.out.println("The multiplication of " + num1 + " and " + num2 + " will be : " + result);
    }
    void division() {
        int result = num1 / num2;
        System.out.println("The division of " + num1 + " and " + num2 + " will be : " + result);
    }

    public static void main(String[] args)   {
        Test t1 = new Test();
        t1.num1 = 10;
        t1.num2 = 5;
        t1.addition();
        t1.subtraction();
        t1.multiplication();
        t1.division();
    }
}