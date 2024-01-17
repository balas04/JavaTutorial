import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter employee's monthly salary:" );

            double monthlySalary = scanner.nextDouble();

            double annualSalary = monthlySalary * 12;

            System.out.println("The employee's annual salary is: $" +annualSalary);

            scanner.close();
    }
}
