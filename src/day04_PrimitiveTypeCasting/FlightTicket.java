package day04_PrimitiveTypeCasting;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the departure location of the flight:");
        String from = read.next();
        System.out.println("Enter the arrival location of the flight:");
        String to = read.next();
        System.out.println("Enter the ticket price:");
        double ticketPrice= read.nextDouble();
        read.close();
        System.out.println("From "+from+" to "+to+" is $"+ticketPrice+" .");

    }
}
