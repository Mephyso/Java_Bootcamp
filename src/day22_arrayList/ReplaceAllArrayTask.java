package day22_arrayList;

import java.util.Arrays;
/*
2. ReplaceAll Task:
  2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement.
  The method replaces all the element of the array that matching with the given old element with the given new element,
  and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays


 */
public class ReplaceAllArrayTask {
    public static void main(String[] args) {

        int[] arrInt= {0,1,2,0,4,0,6};
        char[] arrCh= {80,86,82,83,84,86,86};
        double[] arrDou= {0,1,0,3,4,0,6};
        String[] arrStr= {"0","1","0","3","4","0","6"};

        arrInt=replaceAllElement(arrInt,0,9);
        System.out.println(Arrays.toString(arrInt));

        arrCh=replaceAllElement(arrCh,'V','E');
        System.out.println(Arrays.toString(arrCh));

        arrDou=replaceAllElement(arrDou,0,111);
        System.out.println(Arrays.toString(arrDou));

        arrStr=replaceAllElement(arrStr,"0","OOO");
        System.out.println(Arrays.toString(arrStr));

    }
    public static int[] replaceAllElement(int[] arr, int old, int neu)
    {
        int [] result= new int[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (arr[i]!= old) result[i]=arr[i];
            else result[i]=neu;
        }
        return result;
    }
    public static double[] replaceAllElement(double[] arr, double old, double neu)
    {
        double [] result= new double[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (arr[i]!= old) result[i]=arr[i];
            else result[i]=neu;
        }
        return result;
    }

    public static char[] replaceAllElement(char[] arr, char old, char neu)
    {
        char [] result= new char[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (arr[i]!= old) result[i]=arr[i];
            else result[i]=neu;
        }
        return result;
    }

    public static String[] replaceAllElement(String[] arr, String old, String neu)
    {
        String [] result= new String[arr.length];
        for (int i = 0; i < result.length; i++)
        {
            if (arr[i].equals(old)) result[i]=neu;
            else result[i]=arr[i];
        }
        return result;
    }



}
