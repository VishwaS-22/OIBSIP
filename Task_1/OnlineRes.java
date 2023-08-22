import java.util.*;
public class OnlineRes{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter login ID: ");       // Login form
        String loginId = sc1.nextLine();
        System.out.print("Enter password: ");
        String password = sc1.nextLine();

        System.out.println("\nReservation form: ");     // Reservation form
        System.out.print("Enter basic details: ");
        String basicDetails = sc1.nextLine();
        System.out.print("Enter train number: ");
        String trainNumber = sc1.nextLine();
        System.out.print("Enter train name: ");
        String trainName = sc1.nextLine();
        System.out.print("Enter class type: ");
        String classType = sc1.nextLine();
        System.out.print("Enter date of journey: ");
        String journeyDate = sc1.nextLine();
        System.out.print("Enter place of departure: ");
        String departurePlace = sc1.nextLine();
        System.out.print("Enter destination: ");
        String destination = sc1.nextLine();

        System.out.println("\nCancellation form: ");        // Cancellation form
        System.out.print("Enter PNR number: ");
        String pnrNumber = sc1.nextLine();
        //PNR number details
        System.out.print("Do you want to confirm cancellation? (y/n): ");
        String confirmation = sc1.nextLine();
        if (confirmation.equalsIgnoreCase("y")) {
            System.out.println("Reservation cancelled.");
        } else {
            System.out.println("Cancellation not confirmed.");
        }
        sc1.close();
    }
}