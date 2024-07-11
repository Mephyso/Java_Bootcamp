package day03_Variables;
import java.util.Scanner;

/*
Declare the following variables with appropriate data types:
1. name
2. age
3. gender
4. companyName
5. employeeId
6. jobTitle
7. salary
8. isFullTime
*/

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the employee's name:");
        String name = read.nextLine();
        System.out.println("Please enter the company name:");
        String companyName = read.nextLine();
        System.out.println("Please enter the employee ID:");
        String employeeId = read.nextLine();
        System.out.println("Please enter your job title:");
        String jobTitle = read.nextLine();
        System.out.println("Please enter your gender:");
        char gender = read.next().charAt(0);
        System.out.println("Please enter your age:");
        int age = read.nextInt();
        System.out.println("Please enter your salary:");
        int salary = read.nextInt();
        System.out.println("Are you working full-time?");
        String answer = read.next();
        read.close();

        boolean isFullTime;
        if (answer.equalsIgnoreCase("Evet") || answer.equalsIgnoreCase("Yes")) isFullTime = true;
        else isFullTime = false;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
    }

}
