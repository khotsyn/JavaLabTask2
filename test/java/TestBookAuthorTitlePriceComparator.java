import org.junit.Test;
import task2_8.Book;
import task2_8.comparators.BookAuthorTitlePriceComparator;

import static org.junit.Assert.assertTrue;

public class TestBookAuthorTitlePriceComparator {

    @Test
    public void testCompareMinus1() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("title", "abuthor", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testCompareMinus2() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("tbitle", "author", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testCompareMinus3() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("title", "author", 90);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testCompareMinus4() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("title", "abuthor", 90);
        Book book2 = new Book("tbitle", "author", 100);
        assertTrue(obj.compare(book1, book2) < 0);
    }

    @Test
    public void testComparePlus1() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("title", "abuthor", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testComparePlus2() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("tbitle", "author", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testComparePlus3() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("tbitle", "author", 100);
        Book book2 = new Book("title", "abuthor", 100);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testComparePlus4() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("tbitle", "author", 100);
        Book book2 = new Book("title", "abuthor", 90);
        assertTrue(obj.compare(book1, book2) > 0);
    }

    @Test
    public void testCompareEqual() {
        BookAuthorTitlePriceComparator obj = new BookAuthorTitlePriceComparator();
        Book book1 = new Book("title", "author", 100);
        Book book2 = new Book("title", "author", 100);
        assertTrue(obj.compare(book1, book2) == 0);
    }

}
