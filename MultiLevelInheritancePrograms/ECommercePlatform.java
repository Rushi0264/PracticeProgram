package MultiLevelInheritancePrograms;

class user{
    void login(){
        System.out.println("Login successfully");
    }
    void logout(){
        System.out.println("Logout successfully");
    }
}

class customer extends user{
    void addToCart(){
        System.out.println("Choose product");
    }
}

class seller extends user{
    void product(){
        System.out.println("Electronic products");
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        customer cust = new customer();
        cust.login();
        cust.addToCart();
        cust.logout();
        System.out.println("=================================");
        seller sel = new seller();
        sel.login();
        sel.product();
        sel.logout();
    }

}
