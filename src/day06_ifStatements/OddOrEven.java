package day06_ifStatements;
import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please given the Number:");
        int sayi = scan.nextInt();
        scan.close();
        if (sayi % 2 == 0) {
            System.out.println(sayi + " is even number: True");
            System.out.println(sayi + " is odd number : False");
            System.out.println("I can say that "+sayi + " is even number.");
        } else {
            System.out.println(sayi + " is even number: False");
            System.out.println(sayi + " is odd number : True");
            System.out.println("I can say that "+sayi + " is odd number.");
        }

    }
}
