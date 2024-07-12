package day11_string;
import java.util.Scanner;

public class FrequencyOfWord {
        public static void main(String[] args) {
            // string counting
            Scanner read=new Scanner(System.in);
            System.out.println("Please enter a string:");
            String mainstr= read.nextLine();
            System.out.println("Which word do you want to search?");
            String cstr= read.nextLine();
            read.close();
            int l1,l2,cl;
            l1=mainstr.length();
            cl=cstr.length();
            mainstr=mainstr.replace(cstr,"");
            l2=mainstr.length();
            System.out.println(cstr+" founded "+(l1-l2)/cl+" times in your string.");
        }
}
