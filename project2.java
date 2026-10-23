import java.util.Scanner;

public class ExaminationResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = {
            "Tamil", "English", "Mathematics",
            "Computer Science", "Physics"
        };
        int[] marks = new int[subjects.length];
        int total = 0;
        boolean passed = true;

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNo = sc.nextLine();

        for (int i = 0; i < subjects.length; i++) {
            while (true) {
                System.out.print("Enter marks for " + subjects[i]
                        + " (0-100): ");
                int mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    total += mark;
                    if (mark < 35) {
                        passed = false;
                    }
                    break;
                } else {
                    System.out.println(
                        "Invalid marks. Enter a value from 0 to 100.");
                }
            }
        }

        double percentage = total * 100.0
                / (subjects.length * 100);