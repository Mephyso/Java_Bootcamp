package day11_string;
import java.util.Scanner;

public class CharacterDetermine {
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);

        System.out.println("Please enter a string:");
        String str= read.nextLine();
        read.close();
        if ( str.length() >0)
        {
            char ch = str.charAt(0);
            String result = "";

            if ((int) ch > 64 && (int) ch < 91) result = "uppercase letter";
            else if ((int) ch > 96 && (int) ch < 123) result = "lowercase letter";
            else if ((int) ch > 47 && (int) ch < 58) result = "digit";
            else result = "special character";

            System.out.println("The first character of " + str + " is " + result + ".");
        } else System.err.println("Invalid entry!");
    }
}
