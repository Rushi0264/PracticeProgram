package Encapsulation;

class Balance{
    private double balance;

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if (balance >= 0){
            this.balance=balance;
        }
        else {
            System.out.println("Invalid balance.! Cannot be negative.");
        }
    }
}

public class BalanceTest {
    public static void main(String[] args) {
        Object obj = new Object();
        Balance b = new Balance();
        b.setBalance(5000);
        //b.setBalance(-444);

        System.out.println("Final balance : "+b.getBalance());
    }
}
