import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RentalService service = new RentalService();

        service.addVehicle(new Car(1, "Hyundai", 2500, 5));
        service.addVehicle(new Car(2, "Toyota", 3500, 7));

        service.addVehicle(new Bike(3, "Yamaha", 1000, true));
        service.addVehicle(new Bike(4, "Honda", 800, false));

        while (true) {

            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Show Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.showVehicles();
                    break;

                case 2:

                    System.out.print("Enter Vehicle ID: ");
                    int rentId = sc.nextInt();

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    service.rentVehicle(rentId, days);
                    break;

                case 3:

                    System.out.print("Enter Vehicle ID: ");
                    int returnId = sc.nextInt();

                    service.returnVehicle(returnId);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
