package day09_scanner;
import java.util.Scanner;

public class NumberOfDays_ternary {
    public static void main(String[] args) {
        String result;
        Scanner read= new Scanner(System.in);
        System.out.println("Please given the number of month: ");
        int month= read.nextInt();

        result = (month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12 )? "This month has 31 days" :
                (month==4 ||month==6 ||month==9 ||month==11 )? "This month has 30 days" :
                        (month==2)? "This month has 28 days" : "Invalid Number";
        System.out.println(result);
        read.close();
    }

}
