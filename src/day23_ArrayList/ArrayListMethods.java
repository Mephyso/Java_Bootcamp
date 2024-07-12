package day23_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> intList= new ArrayList<>();
        for (int i = -5; i < 6; i++) intList.add(i);
        System.out.println("intList = " + intList);

        intList.remove(0);
        intList.remove(intList.size()-1);
        System.out.println("intList = " + intList);

        intList.remove(Integer.valueOf(0)); //Degeri 0 a esit olan Object listeden silinir.
        System.out.println("intList = " + intList);

        intList.clear(); //Bütün listeyi siler.
        System.out.println("intList = " + intList);

        for (int i = -5; i < 6; i++) intList.add(i);
        System.out.println("intList = " + intList);
        intList.set(2,0);
        intList.set(0,5);
        System.out.println("intList = " + intList);

        System.out.println("First index of 0 :"+intList.indexOf(0));
        System.out.println("Last index of 0 :"+intList.lastIndexOf(0));

        boolean has0= intList.contains(0);
        System.out.println("has0 = " + has0);
        boolean has10= intList.contains(10);
        System.out.println("has10 = " + has10);

        for (Integer each : intList)
            if (intList.indexOf(each)== intList.lastIndexOf(each)) {
                System.out.println("First unique element is " + each);
                break;
            }

        intList.add(Integer.valueOf(0));
        intList.add(5);

        System.out.println("intList = " + intList);
 //ArrayListten tekrar edilen elementleri silme:
//Birinci yöntemde yeni bir Arrayliste her bir element ön kosullu olarak ekleniyor(Eger element yeni Arraylistte yok ise!!!)
        ArrayList<Integer> nonDup= new ArrayList<>();
        for (Integer each : intList)
            if (!nonDup.contains(each))
                nonDup.add(each);
        System.out.println("nonDup = " + nonDup);

        System.out.println("--------------------------------------------------------------");
        System.out.println("intList = " + intList);

/*Ikinci yöntemde mevcut Arraylistte tekrar eden elementlerin son sirada yer alani siliniyor ( if indexOf==lastIndexOf --> remove(lastIndexOf))
        int n=0;
        while (n < intList.size())
        {
            Integer control= intList.get(n);
            if (intList.indexOf(control)== intList.lastIndexOf(control)) n++;
            else intList.remove(intList.lastIndexOf(control));
        }
        System.out.println("intList = " + intList);*/
//Ücüncü yöntemde mevcut Arraylistte tekrar eden elementlerin ilki siliniyor ( if indexOf==lastIndexOf --> remove(control))

        int n=0;
        while (n < intList.size())
        {
            Integer control= intList.get(n);
            if (intList.indexOf(control)== intList.lastIndexOf(control)) n++;
            else intList.remove(control);
        }
        System.out.println("intList = " + intList);

    }

}