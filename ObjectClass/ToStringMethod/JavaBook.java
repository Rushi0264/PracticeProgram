package ObjectClass.ToStringMethod;

public class JavaBook {

    public String toString(){
        return "Book[id=101, Book Name=Java]";
    }

    public static void main(String[] args) {
        JavaBook b1 = new JavaBook();
        System.out.println(b1.toString());
    }
}
