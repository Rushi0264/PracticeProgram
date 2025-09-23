package Polymorphism.OverridingRunTime;

class Bank{
    double getRateOfInterest(){
        return 0.0;
    }
}

class SBI extends Bank{
    @Override
    double getRateOfInterest(){
        return 7.5;
    }
}

class HDFC extends Bank{
    @Override
    double getRateOfInterest(){
        return 8.2;
    }
}

class ICICI extends Bank{
    @Override
    double getRateOfInterest(){
        return 7.9;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + b2.getRateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + b3.getRateOfInterest() + "%");
    }
}
