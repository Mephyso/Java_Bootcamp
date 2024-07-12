package day20_forEach;
import java.util.*;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15,16,17,18,19};
        int n= arr1.length+arr2.length;
        int[] arr3= new int[n];
        for (int i = 0; i < arr1.length; i++) arr3[i]=arr1[i];
        for (int i = 0; i < arr2.length; i++) arr3[i+arr1.length]=arr2[i];
        System.out.println(Arrays.toString(arr3));
    }
}
