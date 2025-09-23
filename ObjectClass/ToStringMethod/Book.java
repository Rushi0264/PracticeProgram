package ObjectClass.ToStringMethod;

public class Book {
    int id;
    String title;

    Book(int id, String title){
        this.id=id;
        this.title=title;
    }

    public String toString(){
        return title;
    }

    public int hashCode(){
        return id;
    }

    public static void main(String[] args) {
        Book b1 = new Book(101,"Nothing is impossible");
        System.out.println(b1.hashCode()+" "+ b1.toString());
    }
}
