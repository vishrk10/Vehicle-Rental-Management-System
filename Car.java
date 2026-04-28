public class Car extends Vehicle {

    private int seatingCapacity;

    public Car(int vehicleId, String brand,
               double rentPerDay, int seatingCapacity) {

        super(vehicleId, brand, rentPerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car -> ID: " + vehicleId +
                ", Brand: " + brand +
                ", Seats: " + seatingCapacity +
                ", Rent: ₹" + rentPerDay +
                ", Available: " + available);
    }
}
