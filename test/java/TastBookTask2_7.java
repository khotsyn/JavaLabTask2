import org.junit.Test;
import task2_7.Book;

import static java.util.Arrays.sort;
import static org.junit.Assert.assertTrue;

public class TastBookTask2_7 {

    @Test
    public void sortBook() {
        Book[] list = new Book[10];
        for (int i = 0; i < 10; i++) {
            list[i] = new Book((int) (1 + Math.random() * 10));
        }
        sort(list);
        for (int i = 0; i < 10 - 1; i++) {
            assertTrue(list[i].getIsbn() <= list[i + 1].getIsbn());
        }
    }
}
