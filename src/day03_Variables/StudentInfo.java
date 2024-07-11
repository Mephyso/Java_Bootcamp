package day03_Variables;
import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the students name:");
        String students_name = read.nextLine();
        System.out.println("Please enter the students age:");
        int age = read.nextInt();
        System.out.println("Please enter the students gender:");
        char gender = read.next().charAt(0);
        read.nextLine();
        System.out.println("Please enter the students school name:");
        String school_name = read.nextLine();
        System.out.println("Please enter the students ID:");
        String student_id = read.next();
        System.out.println("Please enter the students grade level:");
        String grade_level = read.next();
        System.out.println("Please enter the students GPA:");
        double gpa = read.nextDouble();
        read.close();
        System.out.println("students_name = " + students_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("student_id = " + student_id);
        System.out.println("grade_level = " + grade_level);
        System.out.println("gpa = " + gpa);
    }

}
