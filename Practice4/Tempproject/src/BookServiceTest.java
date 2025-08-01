import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDAO bookDAO;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testFetchAllBooks() {
        // Arrange
        List<Book> mockBooks = Arrays.asList(
            new Book(1, "Clean Code"),
            new Book(2, "Effective Java")
        );
        when(bookDAO.getAllBooks()).thenReturn(mockBooks);

        // Act
        List<Book> books = bookService.fetchAllBooks();

        // Assert
        assertEquals(2, books.size());
        assertEquals("Clean Code", books.get(0).getTitle());
    }
}