package day21_MultiDimentionalArray;

import java.util.Arrays;

import static utilities.ArraysUtility.commonElements;

public class ArraysExamples {
    public static void main(String[] args) {
        String [] arrS1= {"1", "2", "13", "4", "5", "6"};
        String [] arrS2= {"1", "12", "13", "4", "15", "16", "17"};


        System.out.println(Arrays.toString(commonElements(arrS1,arrS2)));

    }
}
