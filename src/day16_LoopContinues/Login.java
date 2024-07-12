package day16_LoopContinues;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String u="Cydeo", p="1234";
        int counter=1;
        boolean result=false;
        do {
            System.out.println("Enter your user name:");
            String user=read.next();
            System.out.println("Enter your password");
            String pass=read.next();
            if (user.equals(u) && pass.equals(p)) { result=true; break; }

            if (counter<3) System.err.println("This  is your "+counter+ ". attempt. \nIncorrect Username/Password, please re-enter! (You have total 3 attempt)");
            counter++;
        } while (counter<4);
        if (result==true) System.out.println("You are now logged in.");
        else System.err.println("Your account is locked!");
        read.close();
    }
}
