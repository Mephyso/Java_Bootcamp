package day11_string;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("This program can find the longest string in given 2 strings.\n Please enter 1.String:");
        String string1= read.nextLine();
        System.out.println("Please enter 2. String:");
        String string2= read.nextLine();
        read.close();
        int s1= string1.length();
        int s2= string2.length();
        String result= (s1>s2)? "1. String is the longest one: "+string1 : (s2>s1)? "2. String is the longest one: "+string2 : "Both of them have  equal length.";
        System.out.println(result);

    }
}
