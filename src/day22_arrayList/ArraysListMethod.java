package day22_arrayList;

import java.util.ArrayList;

public class ArraysListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("size: "+list1.size()+" list1:"+list1);
        list1.add(1,15);
        list1.add(3,25);
        System.out.println("size: "+list1.size()+" list1:"+list1);
        list1.remove(4);
        System.out.println("size: "+list1.size()+" list1:"+list1);
        System.out.println(list1.get(2));
        list1.set(2,21);
        System.out.println("size: "+list1.size()+" list1:"+list1);

        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i < 11; i++) list2.add(10*i);
        for (int i = 0; i < list2.size(); i++) System.out.println(i+". element "+ list2.get(i));
        System.out.println("size: "+list2.size()+" list1:"+list2);




    }
}
