abstract class RideVehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(int id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class CarRide extends RideVehicle implements GPS {
    private String location;

    public CarRide(int id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class BikeRide extends RideVehicle implements GPS {
    private String location;

    public BikeRide(int id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class AutoRide extends RideVehicle implements GPS {
    private String location;

    public AutoRide(int id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

public class RideHailing {
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new CarRide(1, "Rohan", 15),
            new BikeRide(2, "Amit", 10),
            new AutoRide(3, "Sita", 12)
        };

        for (RideVehicle r : rides) {
            r.getVehicleDetails();
            System.out.println("Fare for 10km: " + r.calculateFare(10));
            if (r instanceof GPS) {
                ((GPS) r).updateLocation("Downtown");
                System.out.println("Current Location: " + ((GPS) r).getCurrentLocation());
            }
            System.out.println("----");
        }
    }
}
