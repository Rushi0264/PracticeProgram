package MultiLevelInheritancePrograms;

class device{
    void powerOn(){
        System.out.println("Deviced powered on..!");
    }
}

class mobile extends device{
    void call(){
        System.out.println("Mobile is calling..!");
    }
}

class smartPhone extends mobile{
    void useApp(){
        System.out.println("Use apps..!");
    }
}

class ipad extends smartPhone{
    void game(){
        System.out.println("Play games..!");
    }
}

public class question6 {
    public static void main(String[] args) {
        ipad obj = new ipad();
        obj.powerOn();
        obj.call();
        obj.useApp();
        obj.game();
    }
}
