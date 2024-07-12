package day18_MemoryAllocation;

public class Test {
    public static void main(String[] args) {
        Pizza first= new Pizza(), second = new Pizza(), third= new Pizza(), fourth= new Pizza();
        first.setInfo('s',1,1);
        second.setInfo('m',3,4);
        third.setInfo('l',0,1);
        fourth.setInfo('a',0,-1);
        System.out.println("---------------------------------------------------------------------");

        System.out.println(first+"\n"+second+"\n"+third+"\n"+fourth);

        System.out.println("---------------------------------------------------------------------");

        BankAccount ba1= new BankAccount(), ba2= new BankAccount(), ba3= new BankAccount();
        ba1.setInfo("Ahmet","DE01",1350.00);
        ba2.setInfo("Mehmet","DE02",10.00);
        ba3.setInfo("Ali","DE03",1.00);
        System.out.println(ba1+"\n"+ ba2 +"\n"+ ba3);

        System.out.println("---------------------------------------------------------------------");
        ba1.checkBalance();
        ba3.deposit(25);
        ba2.withdraw(5.5);
        System.out.println("---------------------------------------------------------------------");

        System.out.println(ba1+"\n"+ ba2 +"\n"+ ba3);
        System.out.println("---------------------------------------------------------------------");
        ba3.checkBalance();
        ba1.deposit(-25);
        ba2.withdraw(5.5);
        System.out.println("---------------------------------------------------------------------");

        System.out.println(ba1+"\n"+ ba2 +"\n"+ ba3);

    }
}
