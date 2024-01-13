// Abstract class with inheritance
public abstract class FoodItem implements MenuItem {
    private String itemName;
    private double price;

    // Constructor
    public FoodItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    // Getter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    // Method using polymorphism
    public void printInfo() {
        System.out.println("Item: " + getItemName());
    }
}
