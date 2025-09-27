package Encapsulation;

public class Book {
    private String title;
    private int price;

    static {
        System.out.println("Welcome To Library..!");
        System.out.println("---------------------------------------------------");
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Invalid price, Must be positive..!");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Math");
        b1.setPrice(270);
        System.out.println("Book title : "+b1.getTitle());
        System.out.println("Book Price : "+b1.getPrice());
        System.out.println("---------------------------------------------------");

        Book b2 = new Book();
        b2.setTitle("English");
        b2.setPrice(250);
        System.out.println("Book title : "+b2.getTitle());
        System.out.println("Book price : "+b2.getPrice());
        System.out.println("---------------------------------------------------");

        Book b3 = new Book();
        b3.setTitle("Spoken");
        b3.setPrice(-350);
        System.out.println("Book title : "+b3.getTitle());
        System.out.println("Book price : "+b3.getPrice());
        System.out.println("---------------------------------------------------");
    }
}
