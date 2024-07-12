package day04_PrimitiveTypeCasting;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Alicinin adi:");
        String name= read.nextLine();
        System.out.println("Bina numarasi:");
        String buildingNumber= read.nextLine();
        System.out.println("Sokak adi:");
        String streetName= read.nextLine();
        System.out.println("Sehir:");
        String city= read.nextLine();
        System.out.println("Eyalet:");
        String state= read.nextLine();
        System.out.println("Posta kodu:");
        int zipCode= read.nextInt();
        read.close();

        System.out.println("Your shipping address is:");
        System.err.println("\t"+name+"\n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipCode);



    }
}
