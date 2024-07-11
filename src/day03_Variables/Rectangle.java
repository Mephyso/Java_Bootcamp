package day03_Variables;
import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the height:");
        int height = scan.nextInt();
        System.out.println("Please enter the width:");
        int width = scan.nextInt();
        scan.close();
        System.out.println("Height=\t" + height);
        System.out.println("Width=\t" + width);
        System.out.println("Area=\t\t" + (height * width) + "\nPerimeter=\t\t" + 2 * (height + width));
    }

}
