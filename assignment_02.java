import java.util.Scanner;

class Student {
    String name;
    String id;
    int mark;
    String grade;
    double gradePoint;
    String remark;

    // Constructor to initialize student details
    public Student(String name, String id, int mark) {
        this.name = name;
        this.id = id;
        this.mark = mark;
        determineGradeAndRemark();
    }

    // Method to determine grade, grade point, and remark based on the mark
    private void determineGradeAndRemark() {
        if (mark >= 90) {
            grade = "A+";
            gradePoint = 4.00;
            remark = "High Distinction";
        } else if (mark >= 80) {
            grade = "A";
            gradePoint = 3.75;
            remark = "Distinction";
        } else if (mark >= 75) {
            grade = "A-";
            gradePoint = 3.67;
            remark = "High Credit";
        } else if (mark >= 70) {
            grade = "B+";
            gradePoint = 3.33;
            remark = "Credit";
        } else if (mark >= 65) {
            grade = "B";
            gradePoint = 3.00;
            remark = "Credit";
        } else if (mark >= 60) {
            grade = "B-";
            gradePoint = 2.67;
            remark = "Pass";
        } else if (mark >= 55) {
            grade = "C+";
            gradePoint = 2.33;
            remark = "Pass";
        } else if (mark >= 50) {
            grade = "C";
            gradePoint = 2.00;
            remark = "Pass";
        } else if (mark >= 40) {
            grade = "C-";
            gradePoint = 1.67;
            remark = "Failed (Re-sit the course)";
        } else if (mark >= 35) {
            grade = "D+";
            gradePoint = 1.33;
            remark = "Failed (Repeat the course)";
        } else if (mark >= 30) {
            grade = "D";
            gradePoint = 1.00;
            remark = "Failed (Repeat the course)";
        } else {
            grade = "F";
            gradePoint = 0.00;
            remark = "Failed (Repeat the course)";
        }
    }

    // Method to display student result
    public void displayResult() {
        System.out.println("Result");
        System.out.println("Grade: " + grade);
        System.out.println("Grade Point: " + gradePoint);
        System.out.println("Remark: " + remark);
    }
}

public class assignment_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            // Input student details
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter your mark: ");
            int mark = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create a Student object and display the result
            Student student = new Student(name, id, mark);
            student.displayResult();

            // Ask if the user wants to continue
            System.out.print("Do you want to continue (Y/N): ");
            continueChoice = scanner.nextLine();

        } while (continueChoice.equalsIgnoreCase("Y"));

        scanner.close();
    }
}
