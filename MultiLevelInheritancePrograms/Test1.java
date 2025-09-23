package MultiLevelInheritancePrograms;

class mobilePhone{
    void call(){
        System.out.println("Calling");
    }

    void message(){
        System.out.println("Sent message");
    }
}

class smartPhone1 extends mobilePhone{
    void internetBrowsing(){
        System.out.println("Using internet");
    }

    void takePhoto(){
        System.out.println("Taking photo");
    }
}

class featurePhone extends mobilePhone{
    void playFM(){
        System.out.println("FM playing..!");
    }
}

public class Test1 {
    public static void main(String[] args) {
        smartPhone1 sp = new smartPhone1();
        sp.call();
        sp.message();
        sp.internetBrowsing();
        sp.takePhoto();

        System.out.println();

        featurePhone fp = new featurePhone();
        fp.call();
        fp.message();
        fp.playFM();
    }
}
