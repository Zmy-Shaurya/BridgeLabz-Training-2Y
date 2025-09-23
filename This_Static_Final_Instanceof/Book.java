class Book {
    private String title;
    private String author;
    private final String isbn;

    private static String libraryName = "City Library";

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN12345");
        Book b2 = new Book("Python Guide", "Guido van Rossum", "ISBN67890");

        b1.displayDetails();
        b2.displayDetails();
        Book.displayLibraryName();
    }
}
