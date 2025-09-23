class Product {
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    private static double discount = 10.0; // in percentage

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            double finalPrice = (price * quantity) - ((discount / 100) * (price * quantity));
            System.out.println("Product ID: " + productID + ", Name: " + productName);
            System.out.println("Quantity: " + quantity + ", Price: " + price);
            System.out.println("Discount: " + discount + "%, Final Price: " + finalPrice);
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Shoes", 2000, 2, 101);
        Product p2 = new Product("Watch", 3000, 1, 102);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(20);
        p1.displayDetails();
        p2.displayDetails();
    }
}
