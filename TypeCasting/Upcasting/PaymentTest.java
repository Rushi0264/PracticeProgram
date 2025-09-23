package TypeCasting.Upcasting;

abstract class Payment{
    String payerName;
    double amount;

    Payment(String payerName, double amount){
        this.payerName=payerName;
        this.amount=amount;
    }

    abstract void pay();

    void showDetail(){
        System.out.println(payerName+" wants to pay $ : "+amount);
    }
}

class CreditCard extends Payment{
    String cardNumber;
    CreditCard(String payerName, double amount, String cardNumber){
        super(payerName, amount);
        this.cardNumber=cardNumber;
    }

    @Override
    void pay(){
        System.out.println("Paid $ : "+amount+" using credit card "+cardNumber);
    }
}

class UPIPayment extends Payment{
    String UpiId;
    UPIPayment(String payerName, double amount, String UpiId){
        super(payerName, amount);
        this.UpiId=UpiId;
    }

    @Override
    void pay(){
        System.out.println("Paid $ : "+amount+" using UPI id "+UpiId);
    }
}

class NetBanking extends Payment{
    String bankName;
    NetBanking(String payerName, double amount, String bankName){
        super(payerName, amount);
        this.bankName=bankName;
    }

    @Override
    void pay(){
        System.out.println("Paid $ : "+amount+" using Net banking "+bankName);
    }
}
public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCard("Ruhsikesh", 4000.00, "1234-4321-6785-6798");
        Payment p2 = new UPIPayment("Sumit", 3443.90, "sumit1212@ybl");
        Payment p3 = new NetBanking("Shubham", 10000.00, "SBI");

        p1.showDetail();
        p1.pay();
        p2.showDetail();
        p2.pay();
        p3.showDetail();
        p3.pay();
    }
}
