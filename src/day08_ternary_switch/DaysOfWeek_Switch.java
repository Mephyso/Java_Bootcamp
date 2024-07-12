package day08_ternary_switch;
import java.util.Scanner;

public class DaysOfWeek_Switch {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Please given the day number:");
        int day= read.nextInt();
        read.close();
        String gun="";
        switch (day){
            case 1: gun="Monday"; break;
            case 2: gun="Tuesday"; break;
            case 3: gun="Wednesday"; break;
            case 4: gun="Thursday"; break;
            case 5: gun="Friday"; break;
            case 6: gun="Saturday"; break;
            case 7: gun="Sunday"; break;
            default:gun="Invalid Day!";
        }
        System.out.println(day+". day of week is "+gun);

    }

}
