package AbstractionProgramming;

abstract class BankAccount{
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    abstract void calculateInterest();

    public void deposit(double amount){
        balance  += amount;
        System.out.println("Deposited ₹" + amount);
    }

    public void displayBalance(){
        System.out.println("Account " + accountNumber + " has balance: ₹" + balance);
    }
}

class savingAccount extends BankAccount{
    private double interestRate = 0.05;

    public savingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added to Savings Account: ₹" + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void calculateInterest() {
        System.out.println("No interest for Current Account");
    }

    public void useOverdraft(double amount) {
        if (amount <= overdraftLimit) {
            balance -= amount;
            System.out.println("Overdraft used: ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}


public class BankApp {
    public static void main(String[] args) {
        savingAccount savings = new savingAccount("SAV123", 10000);
        CurrentAccount current = new CurrentAccount("CUR456", 2000);

        savings.deposit(2000);
        savings.calculateInterest();
        savings.displayBalance();

        System.out.println();

        current.deposit(3000);
        current.calculateInterest();
        current.useOverdraft(4000);
        current.displayBalance();
    }
}
