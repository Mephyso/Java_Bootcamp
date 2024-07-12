package day22_arrayList;

import java.util.Arrays;
/*
4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
    the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array


 */
public class SwapArrayTask {
    public static void main(String[] args) {

        int[] arrInt= {0,1,2,3,4,5,6};
        char[] arrCh= {80,81,82,83,84,85,86};
        double[] arrDou= {0,1,2,3,4,5,6};
        String[] arrStr= {"0","1","2","3","4","5","6"};

        arrInt=swapElement(arrInt,0,6);
        System.out.println(Arrays.toString(arrInt));

        arrCh=swapElement(arrCh,0,6);
        System.out.println(Arrays.toString(arrCh));

        arrDou=swapElement(arrDou,0,6);
        System.out.println(Arrays.toString(arrDou));

        arrStr=swapElement(arrStr,0,6);
        System.out.println(Arrays.toString(arrStr));

    }

    public static int[] swapElement(int[] arr, int first, int last)
    {
        if (first<0 || first>=arr.length || last<0 || last>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        int [] result= new int[arr.length];
        result[first]=arr[last];
        result[last]=arr[first];
        for (int i = 0; i < result.length; i++)
            if (i!= first && i!= last) result[i]=arr[i];
        return result;
    }

    public static double[] swapElement(double[] arr, int first, int last)
    {
        if (first<0 || first>=arr.length || last<0 || last>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        double [] result= new double[arr.length];
        result[first]=arr[last];
        result[last]=arr[first];
        for (int i = 0; i < result.length; i++)
            if (i!= first && i!= last) result[i]=arr[i];
        return result;
    }

    public static char[] swapElement(char[] arr, int first, int last)
    {
        if (first<0 || first>=arr.length || last<0 || last>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        char [] result= new char[arr.length];
        result[first]=arr[last];
        result[last]=arr[first];
        for (int i = 0; i < result.length; i++)
            if (i!= first && i!= last) result[i]=arr[i];
        return result;
    }

    public static String[] swapElement(String[] arr, int first, int last)
    {
        if (first<0 || first>=arr.length || last<0 || last>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        String [] result= new String[arr.length];
        result[first]=arr[last];
        result[last]=arr[first];
        for (int i = 0; i < result.length; i++)
            if (i!= first && i!= last) result[i]=arr[i];
        return result;
    }



}
