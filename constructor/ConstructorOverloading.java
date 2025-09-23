package constructor;

class Book{
    Book(){
        System.out.println("Book name : Wings of Fire");
    }

    Book(String title){
        System.out.println("Book title : "+title);
    }

    Book(String title, String author){
        System.out.println("Title of book : "+title+", Author of book : "+author);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println();

        Book b2 = new Book("Wings of Fire");
        System.out.println();

        Book b3 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
    }
}
