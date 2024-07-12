package day13_CustomMethods2;
import java.util.Scanner;

public class AgeDetermine {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = read.nextInt();
        System.out.println("Are you from USA? ");
        String answer= read.next().toLowerCase();
        read.close();
        boolean isAmerican=false;
        if (answer.equals("yes")) isAmerican=true;
        if (age>0 && age<=150) {
            ageGroup(age);
            eligibleToVote(age, isAmerican);
        }
        else System.err.println("Invalid Entry: "+age);
    }
    public static void ageGroup(int age){
        String result= (age<21)? "Teenager" : (age>55)? "Senior" : "Adult";
        System.out.println("You are "+result+" .");
    }
    public static void eligibleToVote(int age, boolean isAmerican){
     if (age>17 && isAmerican==true) System.out.println("You are eligible to vote.");
     else System.out.println("You are not eligible to vote.");
    }

}
