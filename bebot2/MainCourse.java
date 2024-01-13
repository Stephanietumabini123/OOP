// Concrete class implementing an interface and extending an abstract class
public class MainCourse extends FoodItem {
    private String mainCourseType;

    // Constructor
    public MainCourse(String itemName, double price, String mainCourseType) {
        super(itemName, price);
        this.mainCourseType = mainCourseType;
    }

    // Getter method for encapsulation
    public String getMainCourseType() {
        return mainCourseType;
    }

    // Implementation of the displayMenu method from the MenuItem interface
    @Override
    public void displayMenu() {
        System.out.println("Main Course - " + getItemName() + " - $" + getPrice());
    }

    // Method using polymorphism with a customized sentence
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Main Course");
        System.out.println("Main Course Type: " + getMainCourseType());
        System.out.println("");
        System.out.println("Savor the flavors of our hearty " + getItemName() + "!");
    }
}
