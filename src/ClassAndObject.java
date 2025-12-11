class student {
    String name;
    int roll;

    student(String name, int roll)  {
        this.name = name;
        this.roll = roll;
    }

    void show() {
        System.out.println("The student name is: " + this.name + " Roll is: " + this.roll);
    }
}

public class ClassAndObject {
    public static void main(String[] args)  {
        student s = new student("Alex", 18);
        s.show();
    }
}