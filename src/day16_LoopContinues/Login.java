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
        if (result) System.out.println("You are now logged in.");
        else System.err.println("Your account is locked!");
        read.close();
    }

    public static class UniqueCharacters {
        public static void main(String[] args) {
            Scanner read= new Scanner(System.in);
            System.out.println("Please enter the String: ");
            String mainstr= read.nextLine();
            read.close();

            String result =firstMethod(mainstr);
            yaz(result);

            result =secondMethod(mainstr);
            yaz(result);

            result =thirdMethod(mainstr);
            yaz(result);


        }
        public static String firstMethod(String str)
        {
            String result="";
            do{
                int l1=str.length();
                String control= ""+str.charAt(0);
                str=str.replace(control,"");
                int l2=str.length();
                if (l1==l2+1) result+=control+"";
            } while (str.length()>0);
            return result;
        }

        public static String secondMethod(String master)
        {
            String result="";
            for (int i=0; i<master.length(); i++)
                if (master.indexOf(master.charAt(i))==master.lastIndexOf(master.charAt(i))) result+= master.charAt(i);
            return result;
        }

        public static String thirdMethod(String mstr)
        {
            String result="";

            for (int i=0;i<mstr.length(); i++ )
                {
                    int counter=0;
                    for (int j=0;j<mstr.length(); j++ )
                        if (mstr.charAt(i)==mstr.charAt(j)) counter++ ;
                    if (counter == 1) result+=mstr.charAt(i);
                }

            return result;
        }

        public static void yaz(String result)
        {
            if (result.length()>0)
                System.out.println("Unique characters: \"" +result+"\"");
            else System.err.println("There is no unique character in your string!");
        }

    }
}
