package day21_MultiDimentionalArray;


import utilities.ArraysUtility;

import java.util.Arrays;

public class MultiDArrayIntro {
    public static void main(String[] args) {

        int [] arr1= {1, 2, 3, 4, 5, 6};
        int [] arr2= {11, 12, 13, 14, 15, 16, 17};
        int [] arr3= {21, 22, 23, 24};
        int [] arr4= {31, 32, 33};
        int [] arr5= {41, 42, 43, 44, 45};
        int[][] arr2D={arr1,arr2,arr3,arr4,arr5};
       System.out.println(arr2D.length);

        System.out.println("---------------------------------------------------");
        for (int i = 0; i < arr2D.length; i++) System.out.println(arr2D[i].length);

        System.out.println("---------------------------------------------------");
        for (int i = 0; i < arr2D.length; i++) System.out.println(Arrays.toString(arr2D[i]));

        System.out.println("---------------------------------------------------");

        arr2D=ArraysUtility.reverse2D(arr2D);

        for (int i = 0; i < arr2D.length; i++) System.out.println(arr2D[i].length);

        System.out.println("---------------------------------------------------");
        for (int i = 0; i < arr2D.length; i++) System.out.println(Arrays.toString(arr2D[i]));
        System.out.println("---------------------------------------------------");

        System.out.println("Arrays.deepToString() method");
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        arr2D= ArraysUtility.addElement2D(arr2D,arr2);
        System.out.println("Arrays.deepToString(arr2D1) method");
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("---------------------------------------------------");
        System.out.println(ArraysUtility.sumOf2D(arr2D));
        System.out.println("Number of the total elements in the 2D Array:"+ArraysUtility.elementCount2D(arr2D)+"\nAverage of all elements in the 2D Array:"+((double)ArraysUtility.sumOf2D(arr2D)/ArraysUtility.elementCount2D(arr2D)));

    }
}
