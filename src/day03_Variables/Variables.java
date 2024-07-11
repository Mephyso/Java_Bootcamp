package day03_Variables;
import java.util.*;
public class Variables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the initial value:");
        int initial = scan.nextInt();
        System.out.println("Please enter a real number:");
        double realNumber = scan.nextDouble();
        while (initial < 1000) {
            System.out.println(initial + "*" + realNumber + "=" + initial * realNumber);
            if (initial * realNumber > 1) {
                initial = (int) (initial * realNumber);
            } else {
                initial = (int) (initial * realNumber) + 1;
            }
            realNumber = realNumber + realNumber;
        }
        int a = 10, b = 15, c = 20;
        if (!(a >= b && a >= c)) {
            System.out.println(a);
        }
    }

}
