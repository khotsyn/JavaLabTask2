package task2_8.comparators;

import task2_8.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {
        String title1 = book1.getTitle();
        String title2 = book2.getTitle();
        String author1 = book1.getAuthor();
        String author2 = book2.getAuthor();
        if (!title1.equals(title2)) {
            return title1.compareTo(title2);
        } else if (!author1.equals(author2)) {
            return author1.compareTo(author2);
        } else {
            return 0;
        }
    }
}
