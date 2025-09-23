package override;

class parent{
    void display(){
        System.out.println("Parent display");
    }
}

class child extends parent{
    void display(){
        super.display();
        System.out.println("Child display");
    }
}

public class methodOverrideWithSuperKeyword {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
