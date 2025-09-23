package Polymorphism.OverridingRunTime;

class Loan{
    String loanType(){
        return "Generic type";
    }
}

class HomeLoan extends Loan{
    @Override
    String loanType(){
        return "Home Loan";
    }
}

class CarLoan extends Loan{
    @Override
    String loanType() {
        return "Car Loan";
    }
}

class Banks{
    Loan getLoan(){
        return new Loan();
    }
}

class Sbi extends Banks{
    @Override
    HomeLoan getLoan(){
        return new HomeLoan();
    }
}

class Hdfc extends Banks{
    @Override
    CarLoan getLoan(){
        return new CarLoan();
    }
}

public class LoanTypes {
    public static void main(String[] args) {
        Banks b1 = new Sbi();
        Banks b2 = new Hdfc();

        System.out.println(b1.getLoan().loanType());
        System.out.println(b2.getLoan().loanType());
    }
}
