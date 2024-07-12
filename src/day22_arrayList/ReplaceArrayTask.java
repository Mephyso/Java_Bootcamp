package day22_arrayList;

import java.util.Arrays;
/* Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
        The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays

*/
public class ReplaceArrayTask {
    public static void main(String[] args) {

        int[] arrInt= {0,1,2,3,4,5,6};
        char[] arrCh= {80,81,82,83,84,85,86};
        double[] arrDou= {0,1,2,3,4,5,6};
        String[] arrStr= {"0","1","2","3","4","5","6"};

        arrInt=replaceElement(arrInt,5,10);
        System.out.println(Arrays.toString(arrInt));

        arrCh=replaceElement(arrCh,5,'O');
        System.out.println(Arrays.toString(arrCh));

        arrDou=replaceElement(arrDou,5,10);
        System.out.println(Arrays.toString(arrDou));

        arrStr=replaceElement(arrStr,5,"aaaa");
        System.out.println(Arrays.toString(arrStr));

    }

public static int[] replaceElement(int[] arr, int index, int neu)
{
    if (index<0 || index>=arr.length)
    {
        System.err.println("Invalid index number");
        return arr;
    }
    int [] result= new int[arr.length];
        for (int i = 0; i < result.length; i++)
        {
        if (i!= index) result[i]=arr[i];
        else result[i]=neu;
        }
return result;
}

    public static double[] replaceElement(double[] arr, int index, double neu)
    {
        if (index<0 || index>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        double [] result= new double[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (i!= index) result[i]=arr[i];
            else result[i]=neu;
        }
        return result;
    }

    public static char[] replaceElement(char[] arr, int index, char neu)
    {
        if (index<0 || index>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        char [] result= new char[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (i!= index) result[i]=arr[i];
            else result[i]=neu;
        }
        return result;
    }

    public static String[] replaceElement(String[] arr, int index, String neu)
    {
        if (index<0 || index>=arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        String [] result= new String[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (i!= index) result[i]=arr[i];
            else result[i]=neu;
        }
        return result;
    }




}
