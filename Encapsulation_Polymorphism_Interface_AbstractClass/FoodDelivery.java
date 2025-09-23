abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.1; }

    @Override
    public void getDiscountDetails() { System.out.println("Veg discount: 10%"); }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }

    @Override
    public void getDiscountDetails() { System.out.println("Non-Veg discount: 5%"); }
}

public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer", 200, 2),
            new NonVegItem("Chicken", 300, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).applyDiscount();
                ((Discountable) item).getDiscountDetails();
                System.out.println("Final Price: " + (total - discount));
            }
            System.out.println("----");
        }
    }
}
