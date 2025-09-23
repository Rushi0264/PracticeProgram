package MultiLevelInheritancePrograms;

class bank{
    void openAccount(){
        System.out.println("Bank account open..!");
    }
}

class Account extends bank{
    void deposit(){
        System.out.println("Depositing money...!");
    }
}

class savingAccount extends Account{
    void addInterest(){
        System.out.println("Adding interest to saving..!");
    }
}

public class question7 {
    public static void main(String[] args) {
        savingAccount obj = new savingAccount();
        obj.openAccount();
        obj.deposit();
        obj.addInterest();
    }
}
