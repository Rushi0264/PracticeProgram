package ObjectClass.CloneMethod;

class BankDetail implements Cloneable{
    int accNum;
    String accHolderName, branchName;

    BankDetail(int accNum, String accHolderName, String branchName){
        this.accNum=accNum;
        this.accHolderName=accHolderName;
        this.branchName=branchName;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        if (accNum>0) {
            return "Account Number : " + accNum + ", Account Holder Name : " + accHolderName + ", Branch Name : " + branchName;
        }
        return null;
    }
}

public class BankCloneTest {
    static {
        System.out.println("Welcome To SBI..!");
    }

    public static void main(String[] args)
    throws CloneNotSupportedException{
        BankDetail obj1 = new BankDetail(36070881,"Rushikesh Chepte","Wadigodri");
        System.out.println(obj1);

        BankDetail obj2 = (BankDetail) obj1.clone();
        obj2.branchName="Jalna";//branch name changed as Jalna insted of Wadigodri, here we proved both objects are different.
        System.out.println(obj2);
    }
}
