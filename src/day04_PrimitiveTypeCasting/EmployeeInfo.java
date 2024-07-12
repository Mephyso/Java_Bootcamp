package day04_PrimitiveTypeCasting;
import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Name of the Employee:");
        String name= read.nextLine();
        System.out.println("Age of the Employee:");
        int age= read.nextInt();
        System.out.println("Gender of the Employee");
        String gendre= read.next();
        read.nextLine();
        System.out.println("Company name:");
        String company_name= read.nextLine();
        System.out.println("Job title:");
        String jobTitle= read.nextLine();
        System.out.println("Salary:");
        int salary= read.nextInt();
        read.close();
        System.out.println(name+" is "+age+" years old, gender is "+gendre+"."+"\n"+name+" works at "+company_name+" as a "+jobTitle+".\n"+name+" makes $"+salary+" per year.");


    }
}
