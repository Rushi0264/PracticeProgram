package HierarchicalInheritancePrograms;
//import Flowcontrol.Maincar;

class device {
    void boot(){
        System.out.println("Booting device..");
    }
}

class laptop extends device{
    void runProgram(){
        System.out.println("Run laptop on program..");
    }
}

class smartphone extends device{
    void makeCall(){
        System.out.println("Making a call..");
    }
}

public class DeviceExample {
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.boot();
        obj.runProgram();

        smartphone obj2 = new smartphone();
        obj2.boot();
        obj2.makeCall();
    }
}
