package bankAccount;

public class BankAccount {
    private static int count = 1;
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount( ) {
        this.id = count;
        count++;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public double getInterest(int years){
        return balance * years * interestRate;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
