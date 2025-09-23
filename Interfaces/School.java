package Interfaces;

interface Boys{
    void info();
}

interface Girls{
    void info();
}

public class School implements Boys, Girls{
    @Override
    public void info(){
        System.out.println("I am a Student");
    }

    public static void main(String[] args) {
        School s = new School();
        s.info();
    }
}
