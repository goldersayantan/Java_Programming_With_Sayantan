//Constructor Overloading
//Create a class Rectangle with constructors:
//No arguments (set default values).
//Two arguments (length and width).
//One argument (make it a square).
//Write a method to calculate the area.

public class RectangleClass {
    int length;
    int width;
    RectangleClass()    {
        this.length = 10;
        this.width = 20;
    }
    RectangleClass(int len, int wid)    {
        this.length = len;
        this.width = wid;
    }

    RectangleClass(int side)    {
        this.length = side;
        this.width = side;
    }

    void displayArea()  {
        int area = length * width;
        System.out.println("The area will be : " + area);
    }

    public static void main(String[] args)  {
        RectangleClass r1 = new RectangleClass();
        RectangleClass r2 = new RectangleClass(20, 30);
        RectangleClass r3 = new RectangleClass(25);

        r1.displayArea();
        r2.displayArea();
        r3.displayArea();
    }

}

