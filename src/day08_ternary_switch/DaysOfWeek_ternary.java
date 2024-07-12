package day08_ternary_switch;
import java.util.Scanner;

public class DaysOfWeek_ternary {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please given the number of day:");
        int day = read.nextInt();
        read.close();
        String gun="";
        gun = (day==1)? "Monday" : (day==2)? "Tuesday" : (day==3)? "Wednesday" : (day==4)? "Thursday"
                : (day==5)? "Friday" : (day==6)? "Saturday" : (day==7)? "Sunday" : "Invalid Day!";
        System.out.println(day+". day of week is "+gun);


    }
}
