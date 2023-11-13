package org.example.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;
    Book book;

    @BeforeEach
    @DisplayName("Здесь создадим Mock объект для BookService")
    void setUp() {
        bookRepositoryMock = mock(org.example.task2.BookRepository.class);
        bookService = new org.example.task2.BookService(bookRepositoryMock);
        book = new org.example.task2.Book("152");
    }

    @Test
    void findBookById() {
        bookService.findBookById("152");//проверяем метод findBookById
        verify(bookRepositoryMock).findById("152");//проверяем что метод findById был вызван с нужным аргументом
    }

    @Test
    void findAllBooks() {
        bookService.findAllBooks();//проверяем метод findAllBooks
        verify(bookRepositoryMock).findAll();//проверяем что метод findAll был вызван без аргументов
    }
}