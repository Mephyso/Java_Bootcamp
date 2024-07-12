package day21_MultiDimentionalArray;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="    Hello world    I      love     Java   ";
        System.out.println(spaceEraser1(str));
        System.out.println(spaceEraser2(str));
        String str1= "heart", str2="earth";
        System.out.println(str1+" and "+str2+" are anagram: "+anagram(str1,str2));
        str1="aads";
        str2="adsA";
        System.out.println(str1+" and "+str2+" are anagram: "+anagram(str1,str2));
        str1="listen";
        str2="silent";
        System.out.println(str1+" and "+str2+" are anagram: "+anagram(str1,str2));

    }

    public static String spaceEraser1(String str)
    {
        char[] arr= str.trim().toCharArray();
        String result="";

        for (char each: arr)
            if (each!=' ') result+=each;
                else if (result.charAt(result.length()-1)!=' ') result+=each;
                    else continue;
        return result;
    }

    public static String spaceEraser2(String str)
    {
        String[] arr= str.split(" ");
        String result="";

        for (String each: arr)
            if (!each.isEmpty()) result+=each+" ";
                else continue;
        return result.trim();
    }

    public static boolean anagram (String str1, String str2)
    {
        char[] arr1= str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) return true;
        else return false;
    }

}
