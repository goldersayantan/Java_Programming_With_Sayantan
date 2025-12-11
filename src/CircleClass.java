//Create a class Circle with a radius attribute. Write a method to calculate the area.
public class CircleClass    {
    int radius;

    void area() {
        System.out.print("The area of circle will be : " + 3.14 * radius * radius);
    }

    public static void main(String[] args)  {
        CircleClass c1 = new CircleClass();
        c1.radius = 5;
        c1.area();
    }
}