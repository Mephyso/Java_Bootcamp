package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int [] arr2)
    {
        int[] arr3= new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) arr3[i]=arr1[i];
        for (int i = 0; i < arr2.length; i++) arr3[i+arr1.length]=arr2[i];
        return arr3;
    }
    public static double[] merge(double[] arr1, double [] arr2)
    {
        double[] arr3= new double[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) arr3[i]=arr1[i];
        for (int i = 0; i < arr2.length; i++) arr3[i+arr1.length]=arr2[i];
        return arr3;
    }    
    public static char[] merge(char[] arr1, char [] arr2)
    {
        char[] arr3= new char[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) arr3[i]=arr1[i];
        for (int i = 0; i < arr2.length; i++) arr3[i+arr1.length]=arr2[i];
        return arr3;
    }    
    public static String[] merge(String[] arr1, String [] arr2)
    {
        String[] arr3= new String[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) arr3[i]=arr1[i];
        for (int i = 0; i < arr2.length; i++) arr3[i+arr1.length]=arr2[i];
        return arr3;
    }
    
    
    public static int[] reverse(int[] arr1)
    {
        int n=0;
        for (int i = 0; i<(arr1.length-i-1); i++)
        {
            n=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=n;
        }
        return arr1;
    }
    public static double[] reverse(double[] arr1)
    {
        double n;
        for (int i = 0; i<(arr1.length-1-i); i++)
        {
            n=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=n;
        }
        return arr1;
    }
    public static char[] reverse(char[] arr1)
    {
        char n=' ';
        for (int i = 0; i< arr1.length-1-i; i++)
        {
            n=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=n;
        }
        return arr1;
    }
    public static String[] reverse(String[] arr1)
    {
        String n;
        for (int i = 0; i< (arr1.length)-1-i; i++)
        {
            n=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=n;
        }
        return arr1;
    }

    
    public static int [][] reverse2D (int [][] arr2D)
    {
        int [][] result2D= new int[arr2D.length][];
        for (int i = 0, j= arr2D.length-1; i < arr2D.length ; i++, j--) result2D[i]=arr2D[j];
        return result2D;
    }
    public static double [][] reverse2D (double [][] arr2D)
    {
        double [][] result2D= new double[arr2D.length][];
        for (int i = 0, j= arr2D.length-1; i < arr2D.length ; i++, j--) result2D[i]=arr2D[j];
        return result2D;
    }
    public static char [][] reverse2D (char [][] arr2D)
    {
        char [][] result2D= new char[arr2D.length][];
        for (int i = 0, j= arr2D.length-1; i < arr2D.length ; i++, j--) result2D[i]=arr2D[j];
        return result2D;
    }
    public static String [][] reverse2D (String [][] arr2D)
    {
        String [][] result2D= new String[arr2D.length][];
        for (int i = 0, j= arr2D.length-1; i < arr2D.length ; i++, j--) result2D[i]=arr2D[j];
        return result2D;
    }

    
    public static int sumOf2D (int [][] arr2D)
    {
        int result=0;
        for (int[] arr: arr2D)
            for (int n:arr )
                result+=n;
        return result;
    }
    public static double sumOf2D (double [][] arr2D)
    {
        double result=0;
        for (double[] arr: arr2D)
            for (double n:arr )
                result+=n;
        return result;
    }


    public static int elementCount2D (int [][] arr2D)
    {
        int result= 0;
        for (int[] ints : arr2D) result += ints.length;
        return result;
    }
    public static int elementCount2D (double [][] arr2D)
    {
        int result= 0;
        for (double[] ints : arr2D) result += ints.length;
        return result;
    }
    public static int elementCount2D (char [][] arr2D)
    {
        int result= 0;
        for (char[] ints : arr2D) result += ints.length;
        return result;
    }
    public static int elementCount2D (String [][] arr2D)
    {
        int result= 0;
        for (String[] ints : arr2D) result += ints.length;
        return result;
    }


    public static int [][] addElement2D (int [][] arr2D, int [] added)
    {
        int [][] result2D= Arrays.copyOf(arr2D,arr2D.length+1);
        result2D[result2D.length-1]=added;
        return result2D;
    }
    public static double [][] addElement2D (double [][] arr2D, double [] added)
    {
        double [][] result2D= Arrays.copyOf(arr2D,arr2D.length+1);
        result2D[result2D.length-1]=added;
        return result2D;
    }
    public static char [][] addElement2D (char [][] arr2D, char [] added)
    {
        char [][] result2D= Arrays.copyOf(arr2D,arr2D.length+1);
        result2D[result2D.length-1]=added;
        return result2D;
    }
    public static String [][] addElement2D (String [][] arr2D, String [] added)
    {
        String [][] result2D= Arrays.copyOf(arr2D,arr2D.length+1);
        result2D[result2D.length-1]=added;
        return result2D;
    }

    public static boolean contains (int [] arr, int x)
    {
        boolean result=false;
        for (int n:arr)
            if (n == x) {
                result = true;
                break;
            }
        return result;
    }
    public static boolean contains (double [] arr, double x)
    {
        boolean result=false;
        for (double n:arr)
            if (n == x) {
                result = true;
                break;
            }
        return result;
    }
    public static boolean contains (char [] arr, char x)
    {
        boolean result=false;
        for (char n:arr)
            if (n == x) {
                result = true;
                break;
            }
        return result;
    }
    public static boolean contains (String [] arr, String x)
    {
        boolean result=false;
        for (String n:arr)
            if (n.equals(x)) {
                result = true;
                break;
            }
        return result;
    }


    public static String [] commonElements(String [] arr1, String [] arr2)
    {
        String [] temp = new String[arr1.length];
        int counter=0;

        for (String s : arr1) {
            if (contains(arr2, s)) {
                temp[counter] = s;
                counter++;
            }
        }
        return Arrays.copyOfRange(temp,0,counter);
    }

}
