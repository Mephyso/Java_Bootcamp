package day06_ifStatements;
import java.util.*;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What is your grade level?");
        System.err.println("Given number must be  1 ~ 18");
        int grade = read.nextInt();
        read.close();
        if (grade > 0 && grade < 19) {
            if ( grade < 6) System.out.println("Your graduation level is Elementary school. ");
            else if (grade < 9) System.out.println("Your graduation level is Middle school. ");
            else if (grade < 13) System.out.println("Your graduation level is High school. ");
            else if (grade < 17) System.out.println("Your graduation level is College. ");
            else  System.out.println("Your graduation level is Grad school. ");

        } else System.err.println("Invalid Number!");

    }
}
