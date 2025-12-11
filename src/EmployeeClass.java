//Create a class Employee with salary and bonus. Write a method totalSalary() that returns salary + bonus.
class EmployeeClass {
    int salary;
    int bonus;

    void totalSalary()  {
        int totalSalary = salary + bonus;
        System.out.println("The total salary will be : " + totalSalary);
    }

    public static void main(String[] args)  {
        EmployeeClass e1 = new EmployeeClass();
        e1.salary = 100000;
        e1.bonus = 50000;
        e1.totalSalary();
    }
}