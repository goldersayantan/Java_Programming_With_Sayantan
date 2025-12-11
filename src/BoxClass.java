//Explanation:
//• Box class has three fields and a constructor to initialize them.
//• volume method calculates the volume of the box.
//• BoxDemo has a static method printVolume that takes a Box object and prints its volume.
//• In the main method, we create a Box object and pass it to printVolume.

class BoxClass {
    double length;
    double width;
    double height;

    BoxClass(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * height * width;
    }
}

class BoxDemo  {
    static void printVolume(BoxClass b)  {
        System.out.println("The volume is : " + b.volume());
    }
    public static void main(String[] args) {
        BoxClass box = new BoxClass(12.5, 22.5, 30);
        printVolume(box);
    }
}


