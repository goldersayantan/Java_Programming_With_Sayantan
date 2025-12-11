//Explanation:
//• The Student class has two fields: name and rollNo.
//• A constructor initializes these fields.
//• The display method prints the student's details.
//• In the main method, we create an array of Student objects and initialize each element.
//• A loop iterates through the array and calls the display method for each student.

import java.util.Scanner;
public class StudentClass {
    String name;
    int roll;

    StudentClass(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void displayDetails()   {
        System.out.println("Name : " + name + " Roll : " + roll);
    }

    public static void main(String[] args)  {
        StudentClass[] students = new StudentClass[3];
        students[0] = new StudentClass("Alex", 18);
        students[0].displayDetails();
        students[1] = new StudentClass("Adam", 19);
        students[1].displayDetails();
        students[2] = new StudentClass("Bob", 20);
        students[2].displayDetails();
    }
}


