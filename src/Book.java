public class Book {
    private Author author;
    private String nameOfBook;
    private int year;

    public Book(int year, String nameOfBook, Author author) {
        this.year = year;
        this.nameOfBook = nameOfBook;
    }

    public int getYear() {
        return this.year;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public void setYear(int year) {
        System.out.println("Год выпуска: " + year);
        this.year = year;
    }
}
