import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;

        double grossSalary = basic + hra + da;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary : " + basic);
        System.out.println("HRA (20%)    : " + hra);
        System.out.println("DA (10%)     : " + da);
        System.out.println("Gross Salary : " + grossSalary);

        sc.close();
    }
}