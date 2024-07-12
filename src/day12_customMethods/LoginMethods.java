package day12_customMethods;
import java.util.Scanner;

public class LoginMethods {
    public static void main(String[] args) {
        int answer = 1;
        String Pass, User;
        String sifre = entry();
        User = sifre.substring(0, sifre.indexOf('|'));
        Pass = sifre.substring((sifre.indexOf('|') + 1));

        while (answer == 1 || answer == 2)
        {
            answer=choose();
            if (answer == 1 && verify(User, Pass))
            {
                sifre = entry();
                User = sifre.substring(0, sifre.indexOf('|'));
                Pass = sifre.substring((sifre.indexOf('|') + 1));
            }
            else if (answer==2) verify(User, Pass);
            else System.err.println("EXIT"); ;
        }
    }

    public static int choose(){
            Scanner read = new Scanner(System.in);
            System.out.println("\nWhat do you want to do?\n\nExit \t\t\t\t0\nNew Password entry\t1\nPassword verify\t\t2\n");
            int answer = read.nextInt();
            return answer;
    }

    public static String entry() {
        Scanner input = new Scanner(System.in);
        System.out.print("New User\t\t:");
        String User = input.nextLine();
        System.out.print("New Password\t:");
        String Pass = input.nextLine();
        return (User + "|" + Pass);
    }

    public static boolean verify(String newUser, String newPass) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username\t:");
        String user = scan.nextLine();
        System.out.print("Password\t:");
        String pass = scan.nextLine();
        boolean result = (newUser.equals(user) && newPass.equals(pass)) ? true : false;
        System.err.println("\n\t\t" + result + "\n");
        return result;
    }
}
