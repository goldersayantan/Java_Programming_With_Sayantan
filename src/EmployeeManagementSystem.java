import java.util.Scanner;

class Employee  {
    String empId;
    String name;
    double basicSalary;
    int totalLeaves;
    int leavesTaken = 0;

    Employee(String empId, String name, double basicSalary,  int totalLeaves)  {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.totalLeaves = totalLeaves;
    }

    double calculateTotalSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.05;
        return basicSalary + hra + da + pf;
    }

    boolean applyLeave(int days)    {
        if(days <= 0)   {
            return false;
        }
        if(leavesTaken + days <= totalLeaves)   {
            leavesTaken += days;
            return true;
        }else {
            return false;
        }
    }

    int remainingLeaves()   {
        return totalLeaves - leavesTaken;
    }

    void displayDetails()   {
        System.out.println("Employee id : " + empId);
        System.out.println("Employee name : " + name);
        System.out.println("Basic salary : " + basicSalary);
        System.out.println("Total leaves : " + remainingLeaves());
        System.out.println("Leaves Taken : " + leavesTaken);
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id : ");
        String empId = sc.nextLine();
        System.out.println("Enter the name of the employee : ");
        String name = sc.nextLine();
        System.out.println("Enter the salary of the employee : ");
        double basicSalary = sc.nextDouble();
        System.out.println("Enter the number of leaves : ");
        int leavesTaken = sc.nextInt();

        Employee employee = new Employee(empId, name, basicSalary, leavesTaken);

        while(true) {
            System.out.println("-----Welcome to the employee management system-----");
            System.out.println("1. Display Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Apply for Leave");
            System.out.println("4. Show Leave Balance");
            System.out.println("5. Exit");

            System.out.println("Enter you choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    employee.displayDetails();
                    break;
                case 2:
                    System.out.println("Total Salary of employee : " + employee.calculateTotalSalary());
                    break;
                case 3:
                    System.out.println("Enter the number of days : ");
                    int days = sc.nextInt();
                    sc.nextLine();
                    if(employee.applyLeave(days))   {
                        System.out.println("Leave granted for " + days + " days");
                    }else {
                        System.out.println("Leave not granted.");
                    }
                    break;
                case 4:
                    System.out.println("The remaining leaves is: " +  employee.remainingLeaves());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}