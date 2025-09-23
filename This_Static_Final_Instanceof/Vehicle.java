class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType);
            System.out.println("Registration No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohit", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Sita", "Bike", "DL09XY4567");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails();
        v2.displayDetails();
    }
}
