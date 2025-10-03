
import java.util.Scanner;

public class LoginSystem {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "oop2";
    private static final int MAX_TRIES = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        boolean loggedIn = false;

        System.out.println("--- Welcome to the System Login ---");

        while (tries < MAX_TRIES && !loggedIn) {
            tries++;
            System.out.println("\nAttempt " + tries + " of " + MAX_TRIES);

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine(); 
            
            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("\nLogin successful! Welcome, " + username + ".");
                loggedIn = true;
            } else {
                System.out.println("Error: Invalid username or password.");
            }
        }

        if (!loggedIn) {
            System.out.println("\nMaximum login attempts reached. System locked.");
        }

        scanner.close();
    }
}
```