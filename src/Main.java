import exceptions.BookNotFoundException;
import exceptions.EmptyLibraryException;
import exceptions.InvalidBookException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.listBooks();
        } catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }


        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        Book book4 = null;

        try {
            book1 = new Book("Java Programming", 300);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            book2 = new Book("Design Patterns", -3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            book3 = new Book(null, 100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            book4 = new Book("", 400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }


        try {
            library.addBook(book1);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            library.addBook(book2);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            library.addBook(book3);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            library.addBook(book4);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }


        try {
            library.listBooks();
        } catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }


        try {
            library.borrowBook("Java Programming");
        } catch (BookNotFoundException | EmptyLibraryException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            library.returnBook("Clean Code");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        try {
            library.returnBook("Java Programming");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}