package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogBooks {
    private List<Book> books;

    public CatalogBooks() {
        this.books = new ArrayList<>();
    }

    public void addBook(String name, String author, Integer yearOfPublication) {
        books.add(new Book(name, author, yearOfPublication));
    }

    public List<Book> searchByAuthor(String author) {
        if(this.books.isEmpty()) {
            return null;
        }

        List<Book> booksByAuthor = new ArrayList<>();
        for(Book b : this.books) {
            if(b.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(b);
            }
        }
        return  booksByAuthor;
    }

    public List<Book> searchByYearRange(Integer startingYear, Integer finalYear) {
        if(this.books.isEmpty()) {
            return null;
        }

        List<Book> booksRangeYear = new ArrayList<>();
        for(Book b : this.books) {
            if(b.getYearOfPublication() >= startingYear && b.getYearOfPublication() <= finalYear) {
                booksRangeYear.add(b);
            }
        }
        return booksRangeYear;
    }

    public Book searchByTitle(String title) {
        if(this.books.isEmpty()) {
            return null;
        }

        Book bookByTitle = null;
        for(Book b : this.books) {
            if(b.getTitle().equalsIgnoreCase(title)) {
                bookByTitle = b;
                break;
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        CatalogBooks catalogBooks = new CatalogBooks();
        catalogBooks.addBook("Livro 1", "Gabriel", 2020);
        catalogBooks.addBook("Livro 2", "author2", 2021);
        catalogBooks.addBook("Livro 3", "author 3", 2022);
        catalogBooks.addBook("Livro 4", "author 4", 2023);
        catalogBooks.addBook("Livro 5", "Gabriel", 2024);
        catalogBooks.addBook("Livro 6", "Gabriel", 2024);
        catalogBooks.addBook("Livro 7", "author 7", 2024);

        System.out.println(catalogBooks.searchByAuthor("Gabriel"));
        System.out.println(catalogBooks.searchByTitle("Livro 5"));
        System.out.println(catalogBooks.searchByYearRange(2020, 2023));

    }
}
