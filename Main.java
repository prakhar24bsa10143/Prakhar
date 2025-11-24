import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Library.sampleData();

        while (true) 
            {
            System.out.println("\n=== SIMPLE LIBRARY SYSTEM ===");
            System.out.println("1. Admin Login");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 3) 
                { System.out.println("Bye!"); break; 

                }
            if (ch == 2) 
                { Library.showBooks(); continue; 

                }

            if (ch == 1) 
                {
                if (Admin.login()) {  // This line will now work
                    while (true) 
                        {
                        System.out.println("\n--- ADMIN MENU ---");
                        System.out.println("1. Add Book");
                        System.out.println("2. View Books");
                        System.out.println("3. Issue Book");
                        System.out.println("4. Return Book");
                        System.out.println("5. View Issued");
                        System.out.println("6. Logout");
                        System.out.print("Choose: ");
                        int c = sc.nextInt();
                        if (c == 6) break;
                        switch (c) {
                            case 1 -> Library.addBook();
                            case 2 -> Library.showBooks();
                            case 3 -> Library.issueBook();
                            case 4 -> Library.returnBook();
                            case 5 -> Library.showIssued();
                            default -> System.out.println("Invalid");
                        }
                    }
                } else 
                    {
                    System.out.println("Wrong password!");
                }
            }
        }
        sc.close();
    }
}