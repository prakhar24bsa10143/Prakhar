public class Issue {
    int memberId; String isbn; String issueDate;
    public Issue(int memberId, String isbn, String issueDate) {
        this.memberId = memberId; this.isbn = isbn; this.issueDate = issueDate;
    }
    public String toString() {
        return "Member " + memberId + " → Book: " + isbn + " (Issued: " + issueDate + ")";
    }
}