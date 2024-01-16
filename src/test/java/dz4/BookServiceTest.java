package dz4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository mockBookRepository;
    BookService bookService;
    List<Book> bookList;
    Book book1;

    @BeforeEach
    void setUp() {
        mockBookRepository = mock(BookRepository.class);
        bookService = new BookService(mockBookRepository);
        bookList = List.of(new Book("1"), new Book("2"), new Book("3"));
        book1 = bookList.get(0);
    }

    @Test
    void findBookById() {
        when(mockBookRepository.findById("1")).thenReturn(book1);

        Book request = bookService.findBookById("1");

        assertEquals(book1, request);
    }

    @Test
    void findAllBooks() {
        when(mockBookRepository.findAll()).thenReturn(bookList);

        List<Book> request = bookService.findAllBooks();

        assertEquals(bookList, request);
    }
}