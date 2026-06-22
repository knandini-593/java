import java.util.Scanner;

public class Bus_Ticket_Booking {

    static String Seats[][] = new String[9][6];

    static void View() {
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Seats[i][j] + "  ");
            }
            System.out.println("\n");
        }

        Scanner get = new Scanner(System.in);

        System.out.print("Want to book Bus Tickets: ");
        String choice = get.nextLine();

        if (choice.equals("Yes")) {
            Booking();
        } else {
            System.out.println("Thanks for your Visit.");
        }
    }

    static void Booking() {

        Scanner get = new Scanner(System.in);

        System.out.print("Select your row (1-9): ");
        int T_row = get.nextInt();
        T_row -= 1;

        System.out.print("Select your seat (1-6): ");
        int T_col = get.nextInt();
        T_col -= 1;

        if (Seats[T_row][T_col].equals("Available")) {
            Seats[T_row][T_col] = "Booked";
            System.out.println("Your Bus Ticket Booked.");
        } else {
            System.out.println("Seat is not Available.");
        }

        View();
    }

    Bus_Ticket_Booking() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                Seats[i][j] = "Available";
            }
        }
    }

    public static void main(String[] args) {

        Bus_Ticket_Booking Gurunatha = new Bus_Ticket_Booking();

        Scanner get = new Scanner(System.in);

        System.out.println("===== BUS TICKET BOOKING =====");
        System.out.println("Route : Hyderabad to Vijayawada");

        System.out.print("Want to Book Bus Tickets: ");
        String choice = get.nextLine();

        if (choice.equals("Yes"))
            View();
        else
            System.out.println("Thanks for your Visit");
    }
}