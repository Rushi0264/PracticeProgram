package AbstractionProgramming;

abstract class Bank{

    abstract void withdraw(int amount);

    void welcome(){
        System.out.println("Welcome to your bank..!");
    }
}

class sbi extends Bank{

    @Override
    void withdraw(int amount){
        System.out.println("SBI: Withdrawn " + amount + " successfully ✅");
    }
}

class hdfc extends Bank{

    @Override
    void withdraw(int amount){
        System.out.println("HDFC: Withdrawn " + amount + " successfully ✅");
    }
}

public class Banking {
    public static void main(String[] args) {
        sbi s = new sbi();
        s.welcome();
        s.withdraw(2000);

        hdfc h = new hdfc();
        h.welcome();
        h.withdraw(1100);
    }
}
