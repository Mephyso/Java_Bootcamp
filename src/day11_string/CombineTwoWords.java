package day11_string;
import java.util.Scanner;

public class CombineTwoWords {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("First String:");
        String str1= read.nextLine();
        System.out.println("Second String:");
        String str2= read.nextLine();
        read.close();
        String result="";

        if (str1.charAt(str1.length()-1) == str2.charAt(0)) result= str1+ str2.substring(1);
        else result=str1+str2;
        System.out.println(result);
    }
}
