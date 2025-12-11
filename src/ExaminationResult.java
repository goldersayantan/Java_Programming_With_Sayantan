import java.util.Scanner;

class Students   {
    String name;
    int roll;

    Students(String name, int roll)  {
        this.name = name;
        this.roll = roll;
    }

    void display()  {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}

class Result extends Students   {
    int marks1, marks2, marks3;
    int total;
    double percentage;

    Result(String name, int roll, int marks1, int marks2, int marks3)    {
        super(name, roll);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        calculate();
    }

    void calculate()    {
        total = marks1 +  marks2 + marks3;
        percentage =  (total / 300.0) * 100.0;
    }

    void displayResult()    {
        display();
        System.out.println("Marks1 : " + marks1);
        System.out.println("marks2 : " + marks2);
        System.out.println("Marks3 : " + marks3);
        System.out.println("Total marks : " + total);
        System.out.println("Percentage : " + percentage);

        if(percentage >= 80)    {
            System.out.println("Result : Pass\nGrade : A");
        }else if(percentage >= 60)  {
            System.out.println("Result : Pass\nGrade : B");
        }else if(percentage >= 40)  {
            System.out.println("Result : Pass\nGrade : C");
        }else   {
            System.out.println("Result : Fail");
        }
    }
}

class ExaminationResult {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of total students : ");
        int totalStudents = sc.nextInt();
        sc.nextLine();
        Result[] students = new Result[totalStudents];
        for(int i = 0; i < totalStudents; i++)  {
            System.out.println("-----Details of student number" + (i + 1) + "-----");
            System.out.println("Enter the name of student : ");
            String name = sc.nextLine();
            System.out.println("Enter the roll number of student : ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the marks1 : ");
            int marks1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the marks2 : ");
            int marks2 = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the marks3 : ");
            int marks3 = sc.nextInt();
            sc.nextLine();
            students[i] = new Result(name, roll, marks1, marks2, marks3);
        }

        for(int i = 0; i < totalStudents; i++)  {
            students[i].displayResult();
        }
    }
}
