// Concrete class implementing an interface and extending an abstract class
public class Drinks extends FoodItem {
    private String drinkType;

    // Constructor
    public Drinks(String itemName, double price, String drinkType) {
        super(itemName, price);
        this.drinkType = drinkType;
    }

    // Getter method for encapsulation
    public String getDrinkType() {
        return drinkType;
    }

    // Implementation of the displayMenu method from the MenuItem interface
    @Override
    public void displayMenu() {
        System.out.println("Drink - " + getItemName() + " - $" + getPrice());
    }

    // Method using polymorphism with a customized sentence
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Drink");
        System.out.println("Drink Type: " + getDrinkType());
        System.out.println("");
        System.out.println("Quench your thirst with our refreshing " + getItemName() + "!");
    }
}
