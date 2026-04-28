import java.util.ArrayList;

public class RentalService {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showVehicles() {

        System.out.println("\nAvailable Vehicles:");

        for (Vehicle v : vehicles) {
            v.displayDetails();
        }
    }

    public Vehicle findVehicle(int id) {

        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id) {
                return v;
            }
        }

        return null;
    }

    public void rentVehicle(int id, int days) {

        Vehicle v = findVehicle(id);

        if (v != null && v.isAvailable()) {

            v.rentVehicle();

            double total = days * v.getRentPerDay();

            System.out.println("Vehicle rented successfully!");
            System.out.println("Total Bill: ₹" + total);

        } else {
            System.out.println("Vehicle not available.");
        }
    }

    public void returnVehicle(int id) {

        Vehicle v = findVehicle(id);

        if (v != null) {
            v.returnVehicle();
            System.out.println("Vehicle returned successfully!");
        }
    }
}
