import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Booking System");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter date of booking:");
        String dateOfBooking = scanner.nextLine();

        System.out.print("Enter assigned room ID: ");
        int assignedRoomId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter room ID: ");
        int roomId = scanner.nextInt();

        
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customerName);
        System.out.println("Date of Booking: " + dateOfBooking);
        System.out.println("Assigned Room ID: " + assignedRoomId);
        System.out.println("Room ID: " + roomId);

        
        scanner.close();
    }
}