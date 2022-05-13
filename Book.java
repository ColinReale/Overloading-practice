public class Book {
    public Book(String bookName, int bookPages) {
        this.bookName = bookName;
        this.bookPages = bookPages;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(int bookPages) {
        this.bookPages = bookPages;
    }

    private String bookName;

    public Book(int bookPages, int bookYear) {
        this.bookPages = bookPages;
        this.bookYear = bookYear;
    }

    private int bookPages;
    private int bookYear;

    public Book(String bookName, int bookPages, int bookYear) {
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookYear = bookYear;
    }

    //    getters
    public String getBook() {
        return bookName;
    }

    public int getPages() {
        return bookPages;
    }

    public int getYear() {
        return bookYear;
    }

    public String toString() {
        return getBook() + ", " + getPages() + " pages, " + getYear();

    }
}
