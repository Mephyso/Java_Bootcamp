package day04_PrimitiveTypeCasting;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Recipient's name:");
        String name = read.nextLine();
        System.out.println("Building number:");
        String buildingNumber = read.nextLine();
        System.out.println("Street name:");
        String streetName = read.nextLine();
        System.out.println("City:");
        String city = read.nextLine();
        System.out.println("State:");
        String state = read.nextLine();
        System.out.println("Postal code:");
        int zipCode= read.nextInt();
        read.close();

        System.out.println("Your shipping address is:");
        System.err.println("\t"+name+"\n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipCode);



    }
}
