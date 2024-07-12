package day20_forEach;
import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int n;
        for (int i = 0; i<arr1.length-i-1; i++)
        {
            n=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=n;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
