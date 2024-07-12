package day06_ifStatements;
import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("First number:");
        int first= read.nextInt();
        System.out.println("Second number:");
        int second= read.nextInt();
        read.close();
        if (first>second) {
            System.out.println(first +" is the maximum number");}
        else if (first<second) {
            System.out.println(second +" is the maximum number");}
        else {
            System.out.println("Both number are equal.");}
    }
}
