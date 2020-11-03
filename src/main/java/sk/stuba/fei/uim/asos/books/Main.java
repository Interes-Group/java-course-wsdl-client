package sk.stuba.fei.uim.asos.books;


import sk.stuba.fei.uim.asos.books.ws.Book;
import sk.stuba.fei.uim.asos.books.ws.BookService;
import sk.stuba.fei.uim.asos.books.ws.BookServicePortType;
import sk.stuba.fei.uim.asos.books.ws.Books;

public class Main {

    public static void main(String[] args) {
        BookService service = new BookService();
        BookServicePortType client = service.getBookServicePort();

        Books books = client.list();
        for (Book book : books.getBook()) {
            System.out.println(book.getName());
        }
    }
}
