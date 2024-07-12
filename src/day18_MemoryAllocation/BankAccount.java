package day18_MemoryAllocation;

public class BankAccount {
    public String accountHolder;
    public String accountNumber;
    public double balance;

    public void setInfo (String accountHolder, String accountNumber, double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String toString()
    {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance()
    {
        System.out.println("Available balance: "+balance+"$");
    }
    public void deposit (double amount)
    {
        if (amount>1) this.balance+=amount;
        else {
            System.out.println("Insufficient Amount! "+amount+"$");
            return;
        }
        System.out.println(amount+"$ deposited to "+accountHolder+".");
        checkBalance();
    }
    public void withdraw (double amount)
    {
        if (amount<=0) System.out.println("Insufficient Amount! "+amount+"$");
        else if (amount>balance) System.out.println("Your available balance is Insufficient!\n Available Balance:"+this.balance+"$\t Withdraw Amount:"+amount+"$");

        else {
            this.balance-=amount;
            System.out.println(amount+"$ withdrew from "+accountHolder+".");
            checkBalance();
        }

    }
}
