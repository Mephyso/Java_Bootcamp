package day09_scanner;
import java.util.Scanner;
public class CrewAndPassengers_ternary {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("How many people on the ship? ");
        int crew, passengers, total= read.nextInt();
        read.close();

        String result = (total==50)? "20 crew, 30 passengers." : (total == 75)? "25 crew, 50 passengers." :
                    (total == 100)? "30 crew, 70 passengers." :  "Invalid number!";

            System.out.println(result);


    }

}
