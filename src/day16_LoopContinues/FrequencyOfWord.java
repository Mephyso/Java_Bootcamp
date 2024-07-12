package day16_LoopContinues;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String mainstr= read.nextLine().toLowerCase();
        System.out.println("Please enter the Word: ");
        String control= read.nextLine().toLowerCase();
        int l = control.length();
        int counter=0;
        for (int i=0;i<mainstr.length()-l+1; i++ )

            if (control.charAt(0)==mainstr.charAt(i))
                if (control.equals(mainstr.substring(i,i+l))) counter++ ;


        System.out.println("Given word appear in the given String \"" + counter+"\" times.");
        read.close();
    }
}

