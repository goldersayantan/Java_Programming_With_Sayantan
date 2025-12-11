public class NewBox {
    double height;
    double width;
    double depth;

    NewBox(double height, double width, double depth)   {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    NewBox increaseSize() {
        return new NewBox(height + 1, width + 1, depth + 1);
    }

    void display()  {
        System.out.println("Dimension : " + height + " X " + width + " X " + depth);
    }

    public static void main(String[] args)  {
        NewBox MyBox = new NewBox(10, 20, 30);
        MyBox.display();
        NewBox BiggerBox = MyBox.increaseSize();
        BiggerBox.display();
    }
}