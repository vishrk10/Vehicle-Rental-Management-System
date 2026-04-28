public class Vehicle {

    protected int vehicleId;
    protected String brand;
    protected double rentPerDay;
    protected boolean available;

    public Vehicle(int vehicleId, String brand, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentVehicle() {
        available = false;
    }

    public void returnVehicle() {
        available = true;
    }

    public void displayDetails() {
        System.out.println(vehicleId + " | " + brand +
                " | Rent: ₹" + rentPerDay +
                " | Available: " + available);
    }
}
