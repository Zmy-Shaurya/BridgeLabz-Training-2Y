class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * 1000; // 1000 per day
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Rahul", "Honda City", 5);
        rental.display();
    }
}
