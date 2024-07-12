package day15_LoopContinues;

import java.util.Scanner;

public class MinMiddleMax {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter 3 numbers.");


            System.out.println("What is the 1. number? ");
            int max = read.nextInt(), min=max, middle=min;
            for (int i = 2; i <= 3; i++){
                System.out.println("What is the "+i+". number? ");
                int last = read.nextInt();
                if (last>max) { middle=max; max=last;}
                else { middle= min; min=last;}

            }

            System.out.println("min = " + min);
            System.out.println("middle = " + middle );
            System.out.println("max = " + max);
        read.close();
    }


}
