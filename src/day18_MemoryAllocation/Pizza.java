package day18_MemoryAllocation;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public int calcCost() {
        int cost= (size=='s' || size =='S')? 10 : (size=='m' || size =='M')? 12 :(size=='l' || size =='L')? 14 : 0;
        if (cost!=0 && numberOfPepperoniTopping>=0 && numberOfCheeseTopping>=0) cost=cost+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        else cost=0;
        if (cost==0) System.out.println("Invalid entry!");
        return cost;
    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }

}

