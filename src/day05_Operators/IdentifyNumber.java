package day05_Operators;
import java.util.*;
public class IdentifyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please given the Number:");
        int sayi = scan.nextInt();
        boolean zero = sayi == 0;
        boolean positive = sayi > 0;
        boolean negative = sayi < 0;
        System.out.println(sayi+" is positive number:\t"+positive);
        System.out.println(sayi+" is negative number:\t"+negative);
        System.out.println(sayi+" is zero:\t\t\t\t"+zero);

    }
}
