class Box   {
    double height, width, depth;

    Box(double height, double width, double depth)  {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double volume() {
        return height * width * depth;
    }
}

class BoxDemo {
    static void printVolume(Box b)  {
        System.out.println("Volume : " + b.volume());
    }

    public static void main(String[] args)  {
        Box b = new Box(10, 20, 30);
        printVolume(b);
    }
}
