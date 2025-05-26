class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Book Publication Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Paper Publication Title: " + title);
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        Book b1 = new BookPublication("J.K. Rowling", "Harry Potter");
        Book b2 = new PaperPublication("Albert Einstein", "Theory of Relativity");

        b1.display();
        System.out.println();
        b2.display();
    }
}
