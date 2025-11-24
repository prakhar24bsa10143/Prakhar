import java.util.Scanner;

public class Admin {
    public static boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password (admin): ");
        String pass = sc.nextLine();
        return "admin".equals(pass);
    }
}