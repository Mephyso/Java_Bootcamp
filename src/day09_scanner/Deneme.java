package day09_scanner;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String abc="abc";
        int num=0;
        System.out.println("Name:");

        System.out.println("Number:");
        num = read.nextInt();
        read.nextLine();
        System.out.println("Name:");
        char a = read.next().charAt(0);
        read.close();
        System.out.println("num = " + num);
        System.out.println("abc = " + abc);


    }
}
