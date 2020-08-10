package ls20200806_Comparable;

/**
 * JavaAdvanced 06.08.2020
 */
public class Book implements Comparable<Book> {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Book book) {
        return this.author.compareTo(book.author);
    }

    @Override
    public String toString() {
        return "Author: " + author + ", name: " + name + ", year: " + year;
    }
}
