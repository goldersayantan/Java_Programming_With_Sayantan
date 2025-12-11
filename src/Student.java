public class Student {
    String name;
    int roll;
    Student(String name, int roll)  {
        this.name = name;
        this.roll = roll;
    }
    void display()  {
        System.out.println("Name : " + name + " Roll : " + roll);
    }
    public static void main(String[] args)  {
        Student[] students = new Student[2];
        students[0] = new Student("Alex", 19);
        students[1] = new Student("Adam", 20);

        for(int i = 0; i < 2; i++)  {
            students[i].display();
        }
    }
}
