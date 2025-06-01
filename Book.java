package Pg_4;
public class Book {
    String bookName;
    String author;
    String publisher;
    double price;
    int yearOfPublished;

    // Constructor
    public Book(String bookName, String author, String publisher, double price, int yearOfPublished) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    // Display method
    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }

    // Main method
    public static void main(String[] args) {
        Book b = new Book("Wings of Fire", "A. P. J. Abdul Kalam", "Universities Press", 350.00, 1999);
        b.display();
    }
}
