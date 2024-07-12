package day06_ifStatements;
import java.util.*;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please given the number:");
        int sayi= read.nextInt();
        read.close();
        if (sayi>0) {
            System.out.println(sayi+" is positive number.");
        }
        else if (sayi==0) {
            System.out.println(sayi+" is ZERO.");
        }
        else {
            System.out.println(sayi+" is negative number.");
        }
    }
}
