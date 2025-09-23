package Interfaces;

interface Logger{
    default void logInfo(String msg){
        this.format(msg);
    }
    private void format(String msg){
        System.out.println("Welcome logger : "+msg);
    }
}

public class TestLogger implements Logger {
    public static void main(String[] args) {
        Logger l = new TestLogger();
        l.logInfo("Rushi");
        l.logInfo("Sumit");
        l.logInfo("Avinash");
    }
}
