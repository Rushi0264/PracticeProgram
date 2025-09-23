package Project;

import java.util.ArrayList;
import java.util.Scanner;

// --------------------- Book Class ---------------------
class Book {
    private int bookId;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    public Book(int bookId, String title, String author, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public void issueBook() {
        if (isAvailable()) {
            availableCopies--;
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }

    public void displayBookDetails() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author +
                ", Available: " + availableCopies + "/" + totalCopies);
    }
}

// --------------------- Member Class ---------------------
class Member {
    private int memberId;
    private String name;
    private ArrayList<Book> issuedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    public void displayMemberDetails() {
        System.out.println("ID: " + memberId + ", Name: " + name + ", Issued Books: " + issuedBooks.size());
    }
}

// --------------------- Library Operations Interface ---------------------
interface LibraryOperations {
    void addBook(Book book);

    void addMember(Member member);

    void issueBook(int bookId, int memberId);

    void returnBook(int bookId, int memberId);

    Book searchBookByTitle(String title);

    Book searchBookByAuthor(String author);

    void displayAllBooks();

    void displayAllMembers();
}

// --------------------- Library Class ---------------------
class Library implements LibraryOperations {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    @Override
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }

    @Override
    public void issueBook(int bookId, int memberId) {
        Book book = getBookById(bookId);
        Member member = getMemberById(memberId);

        if (book != null && member != null) {
            if (book.isAvailable()) {
                book.issueBook();
                member.issueBook(book);
                System.out.println("Book issued successfully to " + memberId);
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("Invalid Book ID or Member ID.");
        }
    }

    @Override
    public void returnBook(int bookId, int memberId) {
        Book book = getBookById(bookId);
        Member member = getMemberById(memberId);

        if (book != null && member != null) {
            book.returnBook();
            member.returnBook(book);
            System.out.println("Book returned successfully from " + memberId);
        } else {
            System.out.println("Invalid Book ID or Member ID.");
        }
    }

    @Override
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book searchBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }

    @Override
    public void displayAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found.");
        } else {
            for (Member member : members) {
                member.displayMemberDetails();
            }
        }
    }

    // Helper Methods
    private Book getBookById(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) return book;
        }
        return null;
    }

    private Member getMemberById(int id) {
        for (Member member : members) {
            if (member.getMemberId() == id) return member;
        }
        return null;
    }
}

// --------------------- Main Class ---------------------
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Search Book by Author");
            System.out.println("7. Display All Books");
            System.out.println("8. Display All Members");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Total Copies: ");
                    int totalCopies = sc.nextInt();
                    library.addBook(new Book(bookId, title, author, totalCopies));
                    break;
                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();
                    System.out.print("Enter Member ID: ");
                    int issueMemberId = sc.nextInt();
                    library.issueBook(issueBookId, issueMemberId);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();
                    System.out.print("Enter Member ID: ");
                    int returnMemberId = sc.nextInt();
                    library.returnBook(returnBookId, returnMemberId);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String searchTitle = sc.nextLine();
                    Book foundBookTitle = library.searchBookByTitle(searchTitle);
                    if (foundBookTitle != null) {
                        foundBookTitle.displayBookDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String searchAuthor = sc.nextLine();
                    Book foundBookAuthor = library.searchBookByAuthor(searchAuthor);
                    if (foundBookAuthor != null) {
                        foundBookAuthor.displayBookDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 7:
                    library.displayAllBooks();
                    break;
                case 8:
                    library.displayAllMembers();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}
