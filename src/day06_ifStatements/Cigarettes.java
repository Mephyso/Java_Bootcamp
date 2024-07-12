package day06_ifStatements;

import java.util.*;
public class Cigarettes {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int yas= read.nextInt();
        read.close();
        if (yas<21) {
            System.out.println("You are not eligible to buy Cigarettes");
        }
        else {
            System.out.println("You can buy Cigarettes.");
        }
    }
}
