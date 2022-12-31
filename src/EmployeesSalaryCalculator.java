import java.util.Scanner;
public class EmployeesSalaryCalculator {
    public double Calculator(int hours, double rate) {
        double grossPay;
        if (hours <= 40) {
            grossPay = hours * rate;
        } else {
            System.out.printf("%s", "Overtime Notice: ");
            int HalfTime = hours / 2;
            grossPay = (hours + HalfTime) * rate;
        }
        return grossPay;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeesSalaryCalculator mySalary = new EmployeesSalaryCalculator();
        String[] EmployeeNames = {"", "", ""};
        int[] Hours = {0, 0, 0};
        double Rate;

        System.out.println("Welcome to the Salary Calculator.\n");
        System.out.println("Please enter");

        for (int i = 0; i < 3; i++) {
            System.out.print("Employee" + (i + 1) + "Name: ");
            EmployeeNames[i] = input.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(EmployeeNames[i] + "'s total hours worked: ");
            Hours[i] = input.nextInt();
        }

        System.out.print("Finally, how much did all three made per hour:$");
        Rate = input.nextDouble();
        for (int i = 0; i < 3; i++) {
            System.out.printf("The gross pay for" + EmployeeNames[i] + " is: $%.2f", mySalary.Calculator(Hours[i], Rate));
            System.out.println();
        }
    }
}