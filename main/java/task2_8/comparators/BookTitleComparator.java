package task2_8.comparators;

import task2_8.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {
        String title1 = book1.getTitle();
        String title2 = book2.getTitle();
        return title1.compareTo(title2);
    }
}