package service;

import model.Book;
import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void removeBook(int id) {
        Book book = findBookById(id);

        if (book != null) {
            books.remove(book);
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }
    }
}
