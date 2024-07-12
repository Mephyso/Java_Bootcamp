package day12_customMethods;
import java.util.Scanner;
public class UnderscoreExchange {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Email:");
        String email= read.nextLine();
        read.close();
        if (email.contains("_")) {
            int index1 = email.indexOf('_'), index2 = email.indexOf('@');
            System.out.println(email.substring(index1 + 1, index2) + "_" + email.substring(0, index1) + email.substring(index2));
        } else System.out.println(email);
    }
}
