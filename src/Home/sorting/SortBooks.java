package Home.sorting;

import java.util.*;

class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}

public class SortBooks {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", 2000));
        books.add(new Book("Book B", 1995));
        books.add(new Book("Book C", 2010));
        books.add(new Book("Book D", 1988));

        // Write code here to sort the 'books' list based on their publication years in ascending order using a custom comparator.
        Collections.sort(books, (x,y) -> Integer.compare(x.getPublicationYear(), y.getPublicationYear()));
        // Print the sorted list of books.
        System.out.println(books);
    }
}

