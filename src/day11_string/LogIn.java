package day11_string;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        int cevap=1;
        String newPass="", newUser=" ", pass="",user="";
        while (cevap <3 && cevap>0) {

            System.out.println("What do you want to do?\n\nExit \t\t\t\t0\nNew Password entry\t1\nPassword verify\t\t2\n\n");
            cevap = read.nextInt();
            if (cevap == 1) {
                System.out.print("New User\t\t:");
                newUser = read.next();
                System.out.print("New Password\t:");
                newPass = read.next();
            }
            if (cevap == 2) {
                System.out.print("Username\t:");
                user = read.next();
                System.out.print("Password\t:");
                pass = read.next();
                String result = (newUser.equals(user) && newPass.equals(pass)) ? "Verifying successful" : "Invalid entry";
                System.out.println("\n" + result + "\n\n\n");
                read.nextLine();
                read.nextLine();
            }

            System.out.println("\n\n\n\n\n");
        }

        read.close();

    }
}
