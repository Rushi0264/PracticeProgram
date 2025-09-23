package ObjectClass.ToStringMethod;

public class ArrayOfBook {
    int id;
    String title;

    ArrayOfBook(int id, String title){
        this.id=id;
        this.title=title;
    }

    public String toString(){
        return "[ Book Id : "+id+" Title : "+title+"]";
    }

    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book(101,"Java");
        books[1] = new Book(102,"HTML");
        books[2] = new Book(103,"Data Science");

        //System.out.println(books);

        for (Book b : books){
            System.out.println(b);
        }
    }
}
