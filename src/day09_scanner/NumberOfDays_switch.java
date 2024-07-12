package day09_scanner;
import java.util.Scanner;

public class NumberOfDays_switch {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please given the number of month: ");
        int month= read.nextInt();
        read.close();
        String result = "";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "This month has 31 days"; break;
            case 2: result = "This month has 28 days"; break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "This month has 30 days"; break;
            default: result = "Invalid number!";
        }

        System.out.println(result);
    }

}

