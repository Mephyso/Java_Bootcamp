package day13_CustomMethods2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("First number: ");
        double num1 = read.nextDouble();
        System.out.println("Second number: ");
        double num2 = read.nextDouble();
        System.out.println("Math operator: ");
        char mathOperator = read.next().charAt(0);
        read.close();
        if (mathOperator == '/' || mathOperator == '*' || mathOperator == '-' || mathOperator == '+')
            calculate(num1, num2, mathOperator);
        else System.err.println("Invalid Operator! "+mathOperator);

    }
    public static void calculate(double num1, double num2, char mathOperator){
        double result= (mathOperator=='/')? num1/num2 : (mathOperator=='*')? num1*num2 :(mathOperator=='-')? num1-num2 : num1+num2;
        System.out.println(num1+" "+mathOperator+" "+num2+" = "+result);

    }
}
