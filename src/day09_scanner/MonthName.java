package day09_scanner;
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please given the number of month:");
        int number= read.nextInt();
        read.close();
        String month= (number==1)? "January" :(number==2)? "February" :(number==3)? "March" :(number==4)? "April" :
                (number==5)? "May" : (number==6)? "June" :(number==7)? "July" :(number==8)? "August" :
                (number==9)? "September" :(number==10)? "October" :(number==11)? "November" :(number==12)? "December" : "Invalid number!";
        System.out.println(month);

    }
}
