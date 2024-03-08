import java.util.Objects;

public class Book {
    private Author author;
    private String nameOfBook;
    private int year;

    public Book(int year, String nameOfBook, Author author) {
        this.year = year;
        this.nameOfBook = nameOfBook;
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String toString() {
        return "имя книги: " + this.nameOfBook + ". Год издания: " + this.year + ". Автор: " + this.author;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameOfBook, year);
    }
}
