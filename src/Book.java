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
}
