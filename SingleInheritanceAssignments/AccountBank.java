package SingleInheritanceAssignments;

class bankAccount{
    void deposit(){
        System.out.println("Depositing money...");
    }
}

class savingAccount extends bankAccount{
    void addInterest(){
        System.out.println("Adding interest..!");
    }
}

public class AccountBank {
    public static void main(String[] args) {
        savingAccount obj = new savingAccount();
        obj.deposit();
        obj.addInterest();

//        for (int i=0;i<5;i++){
//            obj.addInterest();
//        }
    }
}
