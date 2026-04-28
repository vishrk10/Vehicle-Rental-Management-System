public class Bike extends Vehicle {

    private boolean sportsBike;

    public Bike(int vehicleId, String brand,
                double rentPerDay, boolean sportsBike) {

        super(vehicleId, brand, rentPerDay);
        this.sportsBike = sportsBike;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike -> ID: " + vehicleId +
                ", Brand: " + brand +
                ", Sports: " + sportsBike +
                ", Rent: ₹" + rentPerDay +
                ", Available: " + available);
    }
}
