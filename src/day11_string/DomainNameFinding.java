package day11_string;
import java.util.Scanner;

public class DomainNameFinding {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter your email:");
        String email= read.nextLine();
        read.close();
        int begin= email.indexOf('@')+1, end= email.indexOf('.');
        String domain=email.substring(begin,end);
        System.out.println(domain);
    }
}
