public class Main {
    public static void main(String[] args) {
        Author author = new Author("Sasha", "Pushkin");
        Book book = new Book(1875, "Kot na dube tom", author);
        Author author1 = new Author("Uilyam", "Greem");
        Book book1 = new Book(1546, "name", author1);
        book1.setYear(1786);
        System.out.println(book.equals(book1));
        System.out.println(book1.toString());
        System.out.println(book.hashCode());
    }
}