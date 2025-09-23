package Interfaces;

interface Camera{
    void takePhoto();
}

interface Music{
    void playMusic();
}

class SmartPhone implements Camera, Music{
    @Override
    public void takePhoto() {
        System.out.println("Hey, Please take photo..!");
    }

    @Override
    public void playMusic() {
        System.out.println("Hey, Please play music..!");
    }
}

public class TestSmartPhone {
    public static void main(String[] args) {
        Camera obj = new SmartPhone();
        obj.takePhoto();

        Music mu = new SmartPhone();
        mu.playMusic();
    }
}
