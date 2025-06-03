public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double fuel;

    public Vehicle(String make, String model, int year, double fuel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel + " liters");
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println(amount + " liters added. Total fuel: " + fuel + " liters.");
        } else {
            System.out.println("Refuel amount must be positive.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2021, 5.0);
        vehicle.displayDetails();

        vehicle.refuel(10.0);
        vehicle.displayDetails();

        vehicle.refuel(-3.0);
    }
}
