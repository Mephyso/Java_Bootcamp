package day22_arrayList;

import java.util.ArrayList;

public class LettersDigitsCharacters {
    public static void main(String[] args) {
        String str="Wooden22spoon!";
        String letters="", digits="", special="";
        ArrayList<Character> charList= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) charList.add(str.charAt(i));
        for (Character character : charList) {
            if (Character.isDigit(character)) digits += character;
            else if (Character.isLetter(character)) letters += character;
            else special += character;
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

    }
}
/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods


 */