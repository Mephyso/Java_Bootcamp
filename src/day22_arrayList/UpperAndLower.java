package day22_arrayList;

import java.util.ArrayList;

public class UpperAndLower {
    public static void main(String[] args) {
        String str="When YOU are good, then I am FINE :) !";
        String upperChar="", lowerChar="";
        ArrayList<Character> charList= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) charList.add(str.charAt(i));
        for (Character character : charList) {
            if (Character.isUpperCase(character)) upperChar += character;
            if (Character.isLowerCase(character)) lowerChar += character;

        }
        System.out.println("Number of upper case characters are equal to number of Lowercase characters = " + (upperChar.length()==lowerChar.length()));
        System.out.println("upperChar = " + upperChar);
        System.out.println("lowerChar = " + lowerChar);

    }


}
/*
6. Write program that returns true if the total number of upper case characters are equal to total
number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods

 */