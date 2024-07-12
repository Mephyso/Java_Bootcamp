package day07_nestedIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What is your grade score?");
        System.err.println("Given number must be  1 ~ 100");
        int grade = read.nextInt();
        read.close();
        if (grade > 0 && grade < 101) {
            if ( grade < 51) System.out.println("Your grade is F. ");
            else if (grade < 61) System.out.println("Your grade is D. ");
            else if (grade < 71) System.out.println("Your grade is C. ");
            else if (grade < 86) System.out.println("Your grade is B. ");
            else  System.out.println("Your grade is A. ");

        } else System.err.println("Invalid Number!");

    }
}
