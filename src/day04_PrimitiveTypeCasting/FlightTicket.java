package day04_PrimitiveTypeCasting;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ucagin kalkis yerini giriniz:");
        String from= read.next();
        System.out.println("Ucagin varis yerini giriniz:");
        String to= read.next();
        System.out.println("Bilet fiyatini giriniz:");
        double ticketPrice= read.nextDouble();
        read.close();
        System.out.println("From "+from+" to "+to+" is $"+ticketPrice+" .");

    }
}
