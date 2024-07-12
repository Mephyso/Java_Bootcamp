package day09_scanner;
import java.util.Scanner;

public class EligibleBuyAlcohol {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please given your age:");
        int age= read.nextInt();
        read.close();
        if (age>0 && age<200){
            String result= (age<21)? "not eligible" :"eligible";
            System.out.println("You are "+age+" years old. You are "+result+" to buy alcohol.");
        } else System.err.println("Invalid number!");

    }
}
