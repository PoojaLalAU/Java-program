import java.util.Scanner;
import java.time.Year;

// Base class
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Price: ₹" + basePrice);
    }

    public double calculateResaleValue() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        return basePrice * Math.pow(0.85, age);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, double basePrice, int numberOfDoors) {
        super(brand, model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public double calculateInsurance() {
        return 5000 + (1000 * numberOfDoors);
    }

    public double calculateMaintenanceCost() {
        return 3000 + (500 * numberOfDoors);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Insurance Cost: ₹" + calculateInsurance());
        System.out.println("Maintenance Cost: ₹" + calculateMaintenanceCost());
        System.out.printf("Resale Value: ₹%.2f\n", calculateResaleValue());
        System.out.println("--------------------------------------------------");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, double basePrice, boolean hasSidecar) {
        super(brand, model, year, basePrice);
        this.hasSidecar = hasSidecar;
    }

    public double calculateInsurance() {
        return 2500 + (hasSidecar ? 1500 : 0);
    }

    public double calculateMaintenanceCost() {
        return 2000 + (hasSidecar ? 1000 : 0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Insurance Cost: ₹" + calculateInsurance());
        System.out.println("Maintenance Cost: ₹" + calculateMaintenanceCost());
        System.out.printf("Resale Value: ₹%.2f\n", calculateResaleValue());
        System.out.println("--------------------------------------------------");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Car Input
        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();
        System.out.print("Model: ");
        String carModel = sc.nextLine();
        System.out.print("Year: ");
        int carYear = sc.nextInt();
        System.out.print("Base Price: ");
        double carBasePrice = sc.nextDouble();
        System.out.print("Number of Doors: ");
        int carDoors = sc.nextInt();
        sc.nextLine();  // Consume leftover newline

        Car car = new Car(carBrand, carModel, carYear, carBasePrice, carDoors);

        // Motorcycle Input
        System.out.println("\nEnter Motorcycle Details:");
        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();
        System.out.print("Model: ");
        String bikeModel = sc.nextLine();
        System.out.print("Year: ");
        int bikeYear = sc.nextInt();
        System.out.print("Base Price: ");
        double bikeBasePrice = sc.nextDouble();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = sc.nextBoolean();

        Motorcycle bike = new Motorcycle(bikeBrand, bikeModel, bikeYear, bikeBasePrice, hasSidecar);

        // Display info
        System.out.println("\n--- Vehicle Summary ---");
        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("Motorcycle Details:");
        bike.displayInfo();

        sc.close();
    }
}