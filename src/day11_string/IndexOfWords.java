package day11_string;
import java.util.Scanner;

public class IndexOfWords {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        System.out.println("Please enter a string:");
        String mainstr= read.nextLine();
        System.out.println("Which word do you want to search?");
        String cstr= read.nextLine();
        read.close();
        int oldIndex=0, newIndex=0, cutPoint=0,counter=0, l=cstr.length();

        if (!mainstr.contains(cstr)) System.out.println("There is no \""+cstr+"\" in your string!");
        while (mainstr.contains(cstr)&&(!cstr.isEmpty())){
            newIndex= mainstr.indexOf(cstr);
            System.out.println("index of "+(counter+1)+". "+cstr+" in your string: "+(newIndex+oldIndex));
            counter++;
            cutPoint=newIndex+l;
            mainstr=mainstr.substring(cutPoint);
            oldIndex=+cutPoint;
        }
    }
}
