package day15_LoopContinues;

import java.util.Scanner;

public class maxAndMinOfEnteredNumbers {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("How many number do you want to enter:");
        int counter = read.nextInt();
        if (counter>0) {
            System.out.println("What is the 1. number? ");
            int max = read.nextInt(), min=max;
            for (int i = 2; i <= counter; i++){
                System.out.println("What is the "+i+". number? ");
                int last = read.nextInt();
                if (last>max) max=last;
                if (last<min) min=last;
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }
        else System.err.println("Invalid entry");
        read.close();
    }
}
