package day12_customMethods;
import java.util.Scanner;

public class NameSurname {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("First Name:");
        String firstName= read.nextLine().trim().replace(" ","");
        System.out.println("Last Name:");
        String lastName= read.nextLine().trim().replace(" ","");
        read.close();
        String name=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("name = " + name);
    }
}
