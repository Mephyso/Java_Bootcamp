package day09_scanner;
import java.util.Scanner;

public class CrewAndPassengers_switch {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("How many people on the ship? ");
        int total= read.nextInt();
        read.close();
        String result="";

            switch (total) {
                case 50:
                    result= "20 crew, 30 passengers.";
                    break;
                case 75:
                    result= "25 crew, 50 passengers.";
                    break;
                case 100:
                    result= "30 crew, 70 passengers.";
                    break;
                default:
                    result="Invalid number!";
            }

            System.out.println(result);


    }

}
