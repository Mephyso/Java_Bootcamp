package day22_arrayList;

import java.util.ArrayList;

public class MAxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>();
        for (int i = -5; i < 5; i++) intList.add(i*i);
        System.out.println("intList = " + intList);
        Integer max= intList.get(0), min=max;
        for (Integer integer : intList)
        {
            if (integer < min) min = integer;
            if (integer > max) max = integer;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */