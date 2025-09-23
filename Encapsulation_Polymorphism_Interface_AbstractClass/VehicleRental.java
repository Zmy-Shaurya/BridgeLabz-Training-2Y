import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return 2000; }

    @Override
    public void getInsuranceDetails() { System.out.println("Car insurance: Flat 2000"); }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return 500; }

    @Override
    public void getInsuranceDetails() { System.out.println("Bike insurance: Flat 500"); }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return 5000; }

    @Override
    public void getInsuranceDetails() { System.out.println("Truck insurance: Flat 5000"); }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Car("C123", 2000),
            new Bike("B456", 500),
            new Truck("T789", 4000)
        );

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " Rent: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());
                ((Insurable) v).getInsuranceDetails();
            }
            System.out.println("----");
        }
    }
}
