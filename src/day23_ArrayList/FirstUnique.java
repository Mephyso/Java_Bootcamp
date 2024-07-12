package day23_ArrayList;

import java.util.ArrayList;

public class FirstUnique
{
    public static void main(String[] args)
    {
        int data[] = {2010, 2014, 2015, 2015, 2014, 2010, 2013};
        ArrayList<Integer> intlist= new ArrayList<>();
        for (int datum : data) intlist.add(datum);

        System.out.println("intlist = " + intlist);
        boolean control=true;

        for (Integer each : intlist)
        {
            int counter=0;
            for (Integer element : intlist)
                if (each == element) counter++;
            // nested for (i,j) loop ile yaparsak kontrol metodumuz: if (Objects.equals(intlist.get(i), intlist.get(j)))

            if (counter==1)
            {
                System.out.println("First unique number is " + each);
                control=false;
                break;
            }
        }
        if (control) System.err.println("There is no unique number in this list!");
    }
}
