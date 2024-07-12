package day12_customMethods;
import java.util.Scanner;
/*
Create a class called TipCalculator, and write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)
*/
public class TipCalculator {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n= read.nextInt();
        System.out.println("Enter the check amount: ");
        int amount= read.nextInt();
        System.out.println("Split or No split (Yes or No)?");
        String answer= read.next();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality= read.next();
        read.close();
        double tip;
        boolean ans=true;

        if (quality.equalsIgnoreCase("Excellent")) tip=amount*0.25;
        else if (quality.equalsIgnoreCase("Great")) tip=amount*0.20;
        else if (quality.equalsIgnoreCase("Good")) tip=amount*0.15;
        else if (quality.equalsIgnoreCase("Fair")) tip=amount*0.10;
        else if (quality.equalsIgnoreCase("Poor")) tip=amount*0.05;
        else tip=0;
        if (answer.equalsIgnoreCase("Yes")) ans=true;
        else ans=false;

        System.out.println("Number of people entered:"+n);
        System.out.println("Total to pay:"+(amount+tip));
        System.out.println("Total tip:"+tip);
        if (ans)
            System.out.println("Total per person:"+((amount+tip)/n)+"\nTip per person:"+(tip/n));
/*
        And then it should display:
        Number of people entered
        Total to pay
        Total tip
        Total per person
        Tip per person
                */
    }
}
