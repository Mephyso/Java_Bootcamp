package day22_arrayList;

import java.util.Arrays;
/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
        the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array

 */
public class InsertArrayTask {
    public static void main(String[] args) {

        int[] arrInt= {0,1,2,3,4,5,6};
        char[] arrCh= {80,81,82,83,84,85,86};
        double[] arrDou= {0,1,2,3,4,5,6};
        String[] arrStr= {"0","1","2","3","4","5","6"};

        arrInt=insertElement(arrInt,4,10);
        System.out.println(Arrays.toString(arrInt));

        arrCh=insertElement(arrCh,4,'O');
        System.out.println(Arrays.toString(arrCh));

        arrDou=insertElement(arrDou,4,10);
        System.out.println(Arrays.toString(arrDou));

        arrStr=insertElement(arrStr,4,"aaaa");
        System.out.println(Arrays.toString(arrStr));

    }

    public static int[] insertElement(int[] arr, int index, int neu)
    {
        if (index<0 || index>arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        int [] result= new int[arr.length+1];
        for (int i = 0, k = 0; i < arr.length; i++, k++)
        {
            if (i != index) result[k] = arr[i];
                else { result[k] = neu; k++; result[k] = arr[i];}
        }
        if (index==arr.length) result[arr.length]=neu;
        return result;

    }

    public static double[] insertElement(double[] arr, int index, double neu)
    {
        if (index<0 || index>arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        double [] result= new double[arr.length+1];
        for (int i = 0, k=0; i < arr.length; i++, k++)
        {
            if (i!= index) result[k]=arr[i];
                else {result[k]=neu; k++; result[k]=arr[i];}
        }
        if (index==arr.length) result[arr.length]=neu;
        return result;
    }

    public static char[] insertElement(char[] arr, int index, char neu)
    {
        if (index<0 || index>arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        char [] result= new char[arr.length+1];
        for (int i = 0, k=0; i < arr.length; i++, k++)
            if (i!= index) result[k]=arr[i];
                else {result[k]=neu; k++; result[k]=arr[i];}
        if (index==arr.length) result[arr.length]=neu;
        return result;
    }

    public static String[] insertElement(String[] arr, int index, String neu)
    {
        if (index<0 || index>arr.length)
        {
            System.err.println("Invalid index number");
            return arr;
        }
        String [] result= new String[arr.length+1];
        for (int i = 0, k=0; i < arr.length; i++, k++)
        {
            if (i!= index) result[k]=arr[i];
                else {result[k]=neu; k++; result[k]=arr[i];}
        }
        if (index==arr.length) result[arr.length]=neu;
        return result;
    }


}
