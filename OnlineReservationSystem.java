import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Reservation {
    private String pnr;
    private String passengerName;
    private String trainNumber;
    private String classType;
    private String journeyDate;
    private String route;

    public Reservation(String pnr, String passengerName, String trainNumber, String classType, String journeyDate, String route) {
        this.pnr = pnr;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.classType = classType;
        this.journeyDate = journeyDate;
        this.route = route;
    }

}

public class OnlineReservationSystem{
    private static Map<String, User> users = new HashMap<>();
    private static Map<String, Reservation> reservations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        users.put("user123", new User("user123", "pass123"));

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();

                if (authenticateUser(username, password)) {
                    System.out.println("Login successful!");
                    reservationMenu(scanner);
                } else {
                    System.out.println("Login failed. Invalid credentials.");
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static boolean authenticateUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    private static void reservationMenu(Scanner scanner) {
        System.out.println("1. Make Reservation");
        System.out.println("2. Cancel Reservation");
        System.out.println("3. Logout");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
        } else if (choice == 2) {
        } else if (choice == 3) {
            System.out.println("Logged out.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
