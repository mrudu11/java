import java.util.Scanner;

class Emp {
    private int empId;
    private String empName;
    private double salary;
    private int joiningYear;

    public Emp(int empId, String empName, double salary, int joiningYear) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    public int getId() {
        return empId;
    }

    public String getName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return joiningYear;
    }

    public void display() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: ₹" + salary + ", Year: " + joiningYear);
    }
}

public class EmpInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp[] employee = new Emp[100];
        int limit = 0;
        int choice;

        while (true) {
            System.out.println("\n1. Add Employee\n2. Display All Employees\n3. Search Employee by ID\n4. Display Employees joined in given Year\n5. Maximum Salary\n6. Minimum Salary\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (limit < employee.length) {
                        System.out.print("Enter ID: ");
                        int empId = sc.nextInt();
                        sc.nextLine(); // consume leftover newline
                        System.out.print("Enter Name: ");
                        String empName = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();
                        System.out.print("Enter Joining Year: ");
                        int year = sc.nextInt();

                        employee[limit++] = new Emp(empId, empName, salary, year);
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee array full!");
                    }
                    break;

                case 2:
                    if (limit == 0) {
                        System.out.println("No employees to display.");
                    } else {
                        for (int i = 0; i < limit; i++) {
                            employee[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                 
                    for (int i = 0; i < limit; i++) {
                        if (employee[i].getId() == searchId) {
                            employee[i].display();
                        System.out.println("employee found");
                            break;
                        }
                        System.out.println("Employee not found.");
                    }
                     
                  break;

                case 4:
                	 System.out.print("Enter joining year to search: ");
                	    int searchYear = sc.nextInt();
                	    for (int i = 0; i < limit; i++) {
                	        if (employee[i].getYear() == searchYear) {
                	            employee[i].display();
                	           System.out.println("employee joined in the year"+searchYear);
                	           break;
                	        }
                	        System.out.println("No employees joined in the year " + searchYear);
                	    }
                	 break;

                case 5:
                    if (limit == 0) {
                        System.out.println("No employee data available.");
                    } else {
                        Emp maxEmp = employee[0];
                        for (int i = 1; i < limit; i++) {
                            if (employee[i].getSalary() > maxEmp.getSalary()) {
                                maxEmp = employee[i];
                            }
                        }
                        System.out.println("Employee with Maximum Salary:");
                        maxEmp.display();
                    }
                    break;

                case 6:
                    if (limit == 0) {
                        System.out.println("No employee data available.");
                    } else {
                        Emp minEmp = employee[0];
                        for (int i = 1; i < limit; i++) {
                            if (employee[i].getSalary() < minEmp.getSalary()) {
                                minEmp = employee[i];
                            }
                        }
                        System.out.println("Employee with Minimum Salary:");
                        minEmp.display();
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
