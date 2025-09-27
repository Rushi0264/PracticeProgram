package Encapsulation;

class Account{
    private String accHolder;
    private double balance;
    private long accNum;

    static {
        System.out.println("Welcome to SBI..!");
        System.out.println("----------------------------------------------------------------");
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public long getAccNum(){
        return accNum;
    }

    public void setAccNum(long accNum){
        this.accNum=accNum;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if (balance > 0) {
            this.balance = balance;
        }else {
            System.out.println("Insufficient balance..!");
        }
    }
}

public class BankAccount extends Account{
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        obj1.setAccHolder("Rushikesh");
        obj1.setAccNum(132324);
        obj1.setBalance(50000);
        System.out.println("Account holder name : "+obj1.getAccHolder());
        System.out.println("Account number : "+obj1.getAccNum());
        System.out.println("Account balance : "+obj1.getBalance());
        System.out.println("----------------------------------------------------------------");

        BankAccount obj2 = new BankAccount();
        obj2.setAccHolder("Shubham");
        obj2.setAccNum(345675);
        obj2.setBalance(10000);
        System.out.println("Account holder name : "+obj2.getAccHolder());
        System.out.println("Account number : "+obj2.getAccNum());
        System.out.println("Account balance : "+obj2.getBalance());
        System.out.println("----------------------------------------------------------------");

        BankAccount obj3 = new BankAccount();
        obj3.setAccHolder("Gaurav");
        obj3.setAccNum(877542);
        obj3.setBalance(40000);
        System.out.println("Account holder name : "+obj3.getAccHolder());
        System.out.println("Account number : "+obj3.getAccNum());
        System.out.println("Account balance : "+obj3.getBalance());
        System.out.println("----------------------------------------------------------------");
    }
}
