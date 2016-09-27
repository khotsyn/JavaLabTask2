import org.junit.Test;
import task2_8.Book;
import task2_8.comparators.BookAuthorTitleComparator;

import static org.junit.Assert.assertTrue;

public class TestBookAuthorTitleComparator {

    @Test
    public void testCompareMinus1() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("title", "abuthor", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testCompareMinus2() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("tbitle", "author", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testCompareMinus3() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("title", "abuthor", 100);
        Book book2 = new Book("tbitle", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testComparePlus1() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("title", "abuthor", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testComparePlus2() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("tbitle", "author", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testComparePlus3() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("tbitle", "author", 100);
        Book book2 = new Book("title", "abuthor", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testCompareEqual1() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) == 0);
    }

    @Test
    public void testCompareEqual2() {
        BookAuthorTitleComparator obj = new BookAuthorTitleComparator();
        Book book1 = new Book("title", "author", 90);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) == 0);
    }
}
