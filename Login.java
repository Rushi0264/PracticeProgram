import java.util.Scanner;

public class Login {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String correctUsername = "Rushikesh123";
            String correctPassword = "Rushi@123";
            String username;
            String password;

            // Initialize a boolean variable to control the loop
            boolean loggedIn = false;

            // While loop to keep asking for credentials until the user logs in
            while (!loggedIn) {
                System.out.print("Enter username: ");
                username = scanner.nextLine();
                System.out.print("Enter password: ");
                password = scanner.nextLine();

                // Check if the entered credentials are correct
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    loggedIn = true; // Set loggedIn to true to exit the loop
                    System.out.println("Login successful! Welcome, " + username + "!");
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }

            // Close the scanner
            scanner.close();
        }
}
