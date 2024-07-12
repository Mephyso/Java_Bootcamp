package day05_Operators;
import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please given the Number:");
        int sayi = read.nextInt();
        boolean even = sayi %2 == 0;
        boolean odd = sayi %2 != 0;
        System.out.println(sayi+" is even number:\t"+even);
        System.out.println(sayi+" is odd number:\t"+odd);
    }
}
