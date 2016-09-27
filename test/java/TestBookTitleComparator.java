import org.junit.Test;
import task2_8.Book;
import task2_8.comparators.BookTitleComparator;

import static org.junit.Assert.assertTrue;

public class TestBookTitleComparator {

    @Test
    public void testCompareMinus() {
        BookTitleComparator obj = new BookTitleComparator();
        Book book1 = new Book("tbitle", "author", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testComparePlus() {
        BookTitleComparator obj = new BookTitleComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("tbitle", "author", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testCompareEqual1() {
        BookTitleComparator obj = new BookTitleComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) == 0);
    }

    @Test
    public void testCompareEqual2() {
        BookTitleComparator obj = new BookTitleComparator();
        Book book1 = new Book("title", "bauthor", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) == 0);
    }

    @Test
    public void testCompareEqual3() {
        BookTitleComparator obj = new BookTitleComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("title", "author", 90);
        assertTrue(obj.compare(book1, book2) == 0);
    }
}
