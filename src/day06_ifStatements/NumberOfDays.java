package day06_ifStatements;
import java.util.*;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("What month of the year are we in (1-12)?");
        int month= read.nextInt();
        read.close();
        int result=0;
        if (month==2){result=28;}
        else if (month==4 || month==6 || month==9 || month==11) {result=30;}
        else {result=31;}
        System.out.println("There is "+result+" days in this Month");


    }
}
