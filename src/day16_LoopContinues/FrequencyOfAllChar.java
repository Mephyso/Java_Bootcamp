package day16_LoopContinues;

import java.util.Scanner;

public class FrequencyOfAllChar {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String mainstr= read.next(), result="";

        int counter=0;

        for (int i=0;i<mainstr.length(); i++ )

            if (!(result.contains(""+mainstr.charAt(i))))
            {
                for (int j=0;j<mainstr.length(); j++ )
                    if (mainstr.charAt(i)==mainstr.charAt(j)) counter++ ;
                result += mainstr.charAt(i);
                System.out.println(mainstr.charAt(i)+" is appear in the given String \"" + counter+"\" times.");
                counter=0;
            }
        read.close();
    }
}
