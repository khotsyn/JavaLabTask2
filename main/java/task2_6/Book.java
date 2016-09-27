package task2_6;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int editor;

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book book = null;
        book = (Book) super.clone();
        return book;
    }

}