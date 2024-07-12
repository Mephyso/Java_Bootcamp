package day04_PrimitiveTypeCasting;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = read.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = read.nextLine();
        read.close();
        System.out.print("Your full name is ");
        System.err.println(firstName+" "+lastName);

    }
}
