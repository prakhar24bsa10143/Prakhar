import java.util.*;

public class Library {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Issue> issues = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void sampleData() {
        books.add(new Book("B001", "Java Programming", "James Gosling", 5));
        books.add(new Book("B002", "Let Us C", "Yashwant", 3));
    }

    public static void addBook() {
        System.out.print("ISBN: "); String isbn = sc.next();
        sc.nextLine();
        System.out.print("Title: "); String title = sc.nextLine();
        System.out.print("Author: "); String author = sc.nextLine();
        System.out.print("Qty: "); int qty = sc.nextInt();
        books.add(new Book(isbn, title, author, qty));
        System.out.println("Book added!");
    }

    public static void showBooks() {
        if (books.isEmpty()) { System.out.println("No books"); return; }
        System.out.println("\n=== ALL BOOKS ===");
        for (Book b : books) System.out.println(b);
    }

    public static void issueBook() {
        System.out.print("Member ID: "); int mid = sc.nextInt();
        System.out.print("Book ISBN: "); String isbn = sc.next();
        for (Book b : books) {
            if (b.isbn.equals(isbn) && b.available > 0) {
                b.available--;
                issues.add(new Issue(mid, isbn, "24-Nov-2025"));
                System.out.println("Issued successfully!");
                return;
            }
        }
        System.out.println("Not available");
    }

    public static void returnBook() {
        System.out.print("Book ISBN: "); String isbn = sc.next();
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                b.available++;
                System.out.println("Returned!");
                return;
            }
        }
    }

    public static void showIssued() {
        if (issues.isEmpty()) { System.out.println("No issued books"); return; }
        System.out.println("\n=== ISSUED BOOKS ===");
        for (Issue i : issues) System.out.println(i);
    }
}