package Static.StaticVariable;

class InfoOfAccountHolder{
    int accountNumber,balance;
    static String bankName;

    InfoOfAccountHolder(int accountNumber, int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        System.out.println("Bank name is : "+bankName+"User account number : "+accountNumber+" and balance is : "+balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        InfoOfAccountHolder.bankName="State Bank Of India, ";
        InfoOfAccountHolder obj = new InfoOfAccountHolder(123456, 2005);
        InfoOfAccountHolder obj1 = new InfoOfAccountHolder(987654, 2359);
    }
}
