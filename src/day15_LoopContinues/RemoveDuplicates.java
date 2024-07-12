package day15_LoopContinues;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter the String");
        String mainstr= read.next(), result="";
        for (int i=0;i<mainstr.length(); i++ )

            if (!result.contains(""+mainstr.charAt(i))) result=result+mainstr.charAt(i) ;

        System.out.println("Duplicates removed, new string is \"" + result+"\"");
    }
}
