package task2_7;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int editor;

    public Book(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public int compareTo(Book book) {
        return this.isbn - book.isbn;
    }
}