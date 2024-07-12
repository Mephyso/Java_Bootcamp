package day04_PrimitiveTypeCasting;

public class TasksDay04 {
    public static void main(String[] args)
    {
        System.out.println(phoneNumber(1,703,4512625));
        System.out.println(birthDate("John", 25, "April", 1995));
        kilosToPounds(10.5);
        gallonsToLiters(10);
        square(5);
        circle(5);
        salaryCalculator(50,45,6,26);
        swap1(10,15);
        swap2(10,15);

    }

    public static String phoneNumber(int countryCode, int areaCode, int localNumber)
    {
        return "+"+countryCode+"("+areaCode+")-"+localNumber;

    /*1. create a class named PhoneNumber and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625*/
    }

    public static String birthDate (String name,int  birthDay, String birthMonth, int birthYear)
    {
        return name+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear+".";

     /*2. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.*/
    }

    public static void kilosToPounds (double kilo)
    {
    double lb= kilo*2.2;
        System.out.println(kilo+" kilos is equal to "+lb+" pounds");

    /*3. Create a class named KilosToPounds and declare the following variables:
                kg
                lb

    3.1 Write a program that can convert the any given number of kilos to pounds
        Ex:
              kg = 10.5

        output:
              10.5 kilos is equal to 23.1 pounds

           Hint:  1kg = 2.2 lb*/
    }

    public static void gallonsToLiters (double gallon)
    {
        double liters= gallon*3.79;
        System.out.println(gallon+" gallons is equal to "+liters+" litters");
        /*4. Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert the any given number of gallons to liters
        Ex:
              gallon = 10

        output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L
*/
    }

    public static void square (int side)
    {
    int area= side*side, perimeter=4*side;
        System.out.println("Area of the square is "+area+
                "\nPerimeter of the square is "+perimeter);
        /*5. Create a class named Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               Area of the square is 25
               Perimeter of the square is 20

*/
    }

    public static void circle (double radius) {
        double area = 3.14 * radius * radius;
        double perimeter = 2 * radius * 3.14;
        System.out.println("Area of the circle is " + area +
                "\nPerimeter of the circle is " + perimeter);
        /*6. Create a class named Circle and declare the following variables:
        radius
                area
        perimeter

        6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
        Ex:
        radius = 5

        output:
        Area of the circle is 78.5
        Perimeter of the circle is 31.4*/
    }

    public static void salaryCalculator ( double hourlyRate, double weeklyHours, double stateTaxPer, double federalTaxPer)
    {
    double salaryBeforeTax= hourlyRate*weeklyHours*52;
    double stateTax=salaryBeforeTax*stateTaxPer/100;
    double federalTax=salaryBeforeTax*federalTaxPer/100;
    double totalTax=stateTax+federalTax;
    double salaryAfterTax= salaryBeforeTax-totalTax;
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        /*Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560*/
    }

    public static void swap1 (int x, int y)
    {
    int z=x; x=y; y=z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    /*8. Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
*/
    }

    public static void swap2 (int x, int y)
    {
     x=x+y; y=x-y; x=x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*9. Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10*/
    }

}
