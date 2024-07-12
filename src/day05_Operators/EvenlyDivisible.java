package day05_Operators;
import java.util.*;
public class EvenlyDivisible {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please given the Number:");
        int sayi = read.nextInt();
        boolean div2 = sayi%2 == 0;
        boolean div3 = sayi%3 == 0;
        boolean div5 = sayi%5 == 0;
        System.out.println(sayi+" is divisible by 2:\t"+div2);
        System.out.println(sayi+" is divisible by 3:\t"+div3);
        System.out.println(sayi+" is divisible by 5:\t"+div5);
    }
}
