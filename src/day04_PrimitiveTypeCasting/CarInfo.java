package day04_PrimitiveTypeCasting;

import java.util.Scanner;

public class CarInfo {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the car's production year:");
        int year= read.nextInt();
        read.nextLine();
        System.out.println("Enter the car's manufacturer:");
        String make= read.nextLine();
        System.out.println("Enter the model:");
        String model= read.nextLine();
        System.out.println("Enter the mileage:");
        int km= read.nextInt();
        read.nextLine();
        System.out.println("Enter the color:");
        String color= read.nextLine();
        System.out.println("Enter the price:");
        int price= read.nextInt();
        read.close();

        System.out.println("Car information is:");
        System.err.println(year+" "+make+" "+model+", "+km+" kilometers,"+color+", $"+price);



    }
}
