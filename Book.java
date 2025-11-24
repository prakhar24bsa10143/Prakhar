public class Book {
    String isbn, title, author;
    int total, available;

    public Book(String isbn, String title, String author, int qty) {
        this.isbn = isbn; this.title = title; this.author = author;
        this.total = this.available = qty;
    }
    public String toString() {
        return isbn + " | " + title + " | " + author + " | Available: " + available + "/" + total;
    }
}