package day09_scanner;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Enter a number please:");
        int number = read.nextInt();
        read.close();
        String result = (number%2 ==1)? "Odd" : "Even";
        System.out.println("Your number is "+number+" and it is "+result+" number.");
    }

}
