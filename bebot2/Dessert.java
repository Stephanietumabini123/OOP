// Concrete class implementing an interface and extending an abstract class
public class Dessert extends FoodItem {
    private String dessertType;

    // Constructor
    public Dessert(String itemName, double price, String dessertType) {
        super(itemName, price);
        this.dessertType = dessertType;
    }

    // Getter method for encapsulation
    public String getDessertType() {
        return dessertType;
    }

    // Implementation of the displayMenu method from the MenuItem interface
    @Override
    public void displayMenu() {
        System.out.println("Dessert - " + getItemName() + " - $" + getPrice());
    }

    // Method using polymorphism with a customized sentence
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Dessert");
        System.out.println("Dessert Type: " + getDessertType());
        System.out.println("");
        System.out.println("Enjoy a sweet treat with our delicious " + getItemName() + "!");
    }
}
