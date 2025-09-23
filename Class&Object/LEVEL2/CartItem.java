import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void displayItem() {
        System.out.println(itemName + " - " + quantity + " x " + price + " = " + getTotalCost());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.getItemName() + " added to cart.");
    }

    public void removeItem(String itemName) {
        cart.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Value: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Shoes", 2000, 2));
        cart.addItem(new CartItem("Shirt", 1500, 1));
        cart.displayTotalCost();
        cart.removeItem("Shirt");
        cart.displayTotalCost();
    }
}
