package TypeCasting.Upcasting;

abstract class BankAccount{
    abstract void interestRate();
}

class SavingsAccount extends BankAccount{
    @Override
    void interestRate(){
        System.out.println("Interest of saving account is 2.5%");
    }
}

class CurrentsAccount extends BankAccount{
    @Override
    void interestRate(){
        System.out.println("Interest of current account is 5%");
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount obj = new SavingsAccount();
        obj.interestRate();
        BankAccount obj1= new CurrentsAccount();
        obj1.interestRate();
    }
}
