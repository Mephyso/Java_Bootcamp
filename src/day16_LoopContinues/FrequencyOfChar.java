package day16_LoopContinues;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String mainstr= read.next();
        System.out.println("Please enter the Char: ");
        char control= read.next().charAt(0);
        int counter=0;
        for (int i=0;i<mainstr.length(); i++ )

            if (control==mainstr.charAt(i)) counter++ ;

        System.out.println("Given char appear in the given String \"" + counter+"\" times.");
        read.close();
    }
}
