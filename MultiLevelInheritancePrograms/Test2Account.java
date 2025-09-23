package MultiLevelInheritancePrograms;

class account{
    void minBalance(){
        System.out.println("Show minimum balance");
    }
    void maxBalance(){
        System.out.println("Show maximum balance");
    }
}

class savingAccountt extends account{
    void showBalanceSave(){
        System.out.println("Show balance of saving account");
    }
}

class currentAccount extends account{
    void showBalanceCurrent(){
        System.out.println("Show balance of current account");
    }
}

public class Test2Account {
    public static void main(String[] args) {
        savingAccountt sa = new savingAccountt();
        sa.minBalance();
        sa.maxBalance();
        sa.showBalanceSave();
        System.out.println();

        currentAccount ca = new currentAccount();
        ca.showBalanceCurrent();
        ca.minBalance();
        ca.maxBalance();
    }
}
