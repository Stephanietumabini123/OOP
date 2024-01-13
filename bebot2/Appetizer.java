// Concrete class implementing an interface and extending an abstract class
public class Appetizer extends FoodItem {
    private String appetizerType;

    // Constructor
    public Appetizer(String itemName, double price, String appetizerType) {
        super(itemName, price);
        this.appetizerType = appetizerType;
    }

    // Getter method for encapsulation
    public String getAppetizerType() {
        return appetizerType;
    }

    // Implementation of the displayMenu method from the MenuItem interface
    @Override
    public void displayMenu() {
        System.out.println("Appetizer - " + getItemName() + " - $" + getPrice());
    }

    // Method using polymorphism with a customized sentence
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Appetizer");
        System.out.println("Appetizer Type: " + getAppetizerType());
        System.out.println(""); 
        System.out.println("Start your meal with our tasty " + getItemName() + "!");
    }
}
