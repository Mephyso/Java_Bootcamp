package day23_ArrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> intList= new ArrayList<>();
        for (int i = -9; i < 12; i++) intList.add(i);
        System.out.println("intList = " + intList);

        Double average=0.0;

        for (Integer integer : intList) average += integer;

        average=average/intList.size();
        System.out.println("average = " + average);
    }
}
