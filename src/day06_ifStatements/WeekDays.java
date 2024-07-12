package day06_ifStatements;
import java.util.*;

public class WeekDays {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Which day of the week is it?");
        int day= read.nextInt();
        read.close();
        String result="";
        if (day==1) {result="Monday";}
        if (day==2) {result="Tuesday";}
        if (day==3) {result="Wednesday";}
        if (day==4) {result="Thursday";}
        if (day==5) {result="Friday";}
        if (day==6) {result="Saturday";}
        if (day==7) {result="Sunday";}
        System.out.println(day+". day of the Week is "+result );
    }
}
