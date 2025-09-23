package TypeCasting.Upcasting;

abstract class BankAccounts{
    String accountHolder;
    double balance;

    BankAccounts(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    abstract void interestRate();

    void showBalance(){
        System.out.println(accountHolder+" has balance : "+balance);
    }
}

class SavingAcc extends BankAccounts{
    SavingAcc(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    void interestRate(){
        System.out.println("Savings Account interest rate is 2.5%");
    }
}

class CurrentAcc extends BankAccounts{
    CurrentAcc(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    void interestRate(){
        System.out.println("Currents Account interest rate is 5%");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccounts obj1 = new SavingAcc("Rushikesh", 3000);
        obj1.showBalance();
        obj1.interestRate();

        System.out.println();

        BankAccounts obj2 = new CurrentAcc("Sumit", 4000);
        obj2.showBalance();
        obj2.interestRate();
    }
}
