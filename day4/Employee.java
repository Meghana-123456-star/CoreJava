public class Employee {

    // Fields
    int id;
    String name;
    double salary;
    String department;

    // Constructor 1 - No arguments
    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
        department = "Not Assigned";
    }

    // Constructor 2 - id and name
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        salary = 0.0;
        department = "Not Assigned";
    }

    // Constructor 3 - All details
    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return salary * 12;
    }

    public static void main(String[] args) {

        // Using Constructor 1
        Employee employee1 = new Employee();

        // Using Constructor 2
        Employee employee2 = new Employee(102, "Rahul");

        // Using Constructor 3
        Employee employee3 = new Employee(
                101,
                "Meghana",
                45000.0,
                "IT"
        );

        // Display employee 3 details
        employee3.displayDetails();

        // Calculate annual salary
        double annualSalary = employee3.calculateAnnualSalary();

        System.out.println("Monthly Salary: " + employee3.salary);
        System.out.println("Annual Salary: " + annualSalary);
    }
}