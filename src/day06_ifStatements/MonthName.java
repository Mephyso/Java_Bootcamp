package day06_ifStatements;
import java.util.*;

public class MonthName {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Which month of the year are we in?");
        int mounth = read.nextInt();
        read.close();
        String result = "";
        if (mounth == 1) {
            result = "January";
        }
        else if (mounth == 2) {
            result = "February";
        }
        else if (mounth == 3) {
            result = "March";
        }
        else if (mounth == 4) {
            result = "April";
        }
        else if (mounth == 5) {
            result = "May";
        }
        else if (mounth == 6) {
            result = "June";
        }
        else if (mounth == 7) {
            result = "July";
        }
        else if (mounth == 8) {
            result = "August";
        }
        else if (mounth == 9) {
            result = "September";
        }
        else if (mounth == 10) {
            result = "October";
        }
        else if (mounth == 11) {
            result = "November";
        }
        else if (mounth == 12) {
            result = "December";
        }
        else System.err.println("Invalid number!");
        if (mounth>0 && mounth<13) System.out.println(mounth + ". month of the Year is " + result);
    }
}
