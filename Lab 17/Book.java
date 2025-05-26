// Copy Constructor (B)
public class Book {
    String title;

    Book(String t) {
        title = t;
    }

    Book(Book b) {
        title = b.title;
    }

    void display() {
        System.out.println(title);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book(b1);
        b1.display();
        b2.display();
    }
}
