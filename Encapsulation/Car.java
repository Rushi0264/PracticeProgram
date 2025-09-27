package Encapsulation;

public class Car {
    private String brand;
    private int speed;

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setSpeed(int speed){
        if (speed < 200) {
            this.speed = speed;
        }else {
            System.out.println("Speed is more than 200..!");
        }
    }
    public int getSpeed(){
        return speed;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Tata");
        c1.setSpeed(200);
        System.out.println("Brand name : "+c1.getBrand());
        System.out.println("Speed : "+c1.getSpeed());
    }
}
