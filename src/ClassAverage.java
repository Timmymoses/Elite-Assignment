import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int gradeCounter = 1;

        while (gradeCounter <=10){
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        double average = total/10;

        System.out.printf("%nTotal of all the 10 grades is %.2f%n", total);
        System.out.printf("Class average is %.2f%n", average);
    }
}