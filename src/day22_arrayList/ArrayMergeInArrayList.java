package day22_arrayList;

import java.util.ArrayList;

public class ArrayMergeInArrayList {
    public static void main(String[] args)
    {
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        System.out.println(ArrayMergeToList(arr1,arr2));
    }
    public static ArrayList<String> ArrayMergeToList(String[] arr1, String[] arr2)
    {
    ArrayList<String> result=new ArrayList<>();
        for (String s : arr1) result.add(s);
        for (String s : arr2) result.add(s);
    return result;
    }
}
/*
7. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */