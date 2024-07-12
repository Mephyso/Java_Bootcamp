package day04_PrimitiveTypeCasting;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz:");
        String firstName= read.nextLine();
        System.out.println("Lütfen soyadinizi giriniz:");
        String lastName= read.nextLine();
        read.close();
        System.out.print("Tam adiniz ");
        System.err.println(firstName+" "+lastName);

    }
}
