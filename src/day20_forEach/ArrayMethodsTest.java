package day20_forEach;
import utilities.ArraysUtility;

import java.util.*;
public class ArrayMethodsTest {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15,16,17,18,19};
        int[] arr3= ArraysUtility.merge(arr1,arr2);
        arr1= ArraysUtility.reverse(arr1);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr1));


    }
}
