import java.util.Scanner;

public class student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();
        float total = 0.0f;

       
        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            float grade = sc.nextFloat();
            total += grade;
        }
        double average = total / numGrades;

        char grade='F';
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; 
        }
        System.out.println("Total is :" + total);
        System.out.println("The average grade is: " + average);
        

        System.out.println("The assigned grade is: " + grade);
    }
}
