import java.util.Scanner;

// Main class representing the restaurant
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for menu item selection
        System.out.println("Choose Menu: ");
        System.out.println("1. Dessert");
        System.out.println("2. Main Course");
        System.out.println("3. Drinks");
        System.out.println("4. Appetizer"); // Added option for Appetizer
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();

        // Process user's choice
        switch (choice) {
            case 1:
                // Get user input for dessert item's name, price, and type
                System.out.print("Enter the name of the dessert: ");
                String dessertName = scanner.next();
                System.out.print("Enter the price of the dessert: ");
                double dessertPrice = scanner.nextDouble();
                System.out.print("Enter the type of the dessert: ");
                String dessertType = scanner.next();

                // Creating an instance of Dessert with user input
                Dessert dessert = new Dessert(dessertName, dessertPrice, dessertType);
                System.out.println("");
                // Using polymorphism to call the overridden method
                dessert.printInfo();
                System.out.println("");
                // Using the interface method
                dessert.displayMenu();
                break;
            case 2:
                // Get user input for main course item's name, price, and type
                System.out.print("Enter the name of the main course: ");
                String mainCourseName = scanner.next();
                System.out.print("Enter the price of the main course: ");
                double mainCoursePrice = scanner.nextDouble();
                System.out.print("Enter the type of the main course: ");
                String mainCourseType = scanner.next();

                // Creating an instance of Main Course with user input
                MainCourse mainCourse = new MainCourse(mainCourseName, mainCoursePrice, mainCourseType);
                System.out.println("");
                // Using polymorphism to call the overridden method
                mainCourse.printInfo();
                System.out.println("");
                // Using the interface method
                mainCourse.displayMenu();
                break;
            case 3:
                // Get user input for drink item's name, price, and type
                System.out.print("Enter the name of the drink: ");
                String drinkName = scanner.next();
                System.out.print("Enter the price of the drink: ");
                double drinkPrice = scanner.nextDouble();
                System.out.print("Enter the type of the drink: ");
                String drinkType = scanner.next();

                // Creating an instance of Drink with user input
                Drinks drink = new Drinks(drinkName, drinkPrice, drinkType);
                System.out.println("");
                // Using polymorphism to call the overridden method
                drink.printInfo();
                System.out.println("");
                // Using the interface method
                drink.displayMenu();
                break;
            case 4:
                // Get user input for appetizer item's name, price, and type
                System.out.print("Enter the name of the appetizer: ");
                String appetizerName = scanner.next();
                System.out.print("Enter the price of the appetizer: ");
                double appetizerPrice = scanner.nextDouble();
                System.out.print("Enter the type of the appetizer: ");
                String appetizerType = scanner.next();

                // Creating an instance of Appetizer with user input
                Appetizer appetizer = new Appetizer(appetizerName, appetizerPrice, appetizerType);
                System.out.println("");
                // Using polymorphism to call the overridden method
                appetizer.printInfo();
                System.out.println("");
                // Using the interface method
                appetizer.displayMenu();
                break;
            default:
                System.out.println("Invalid choice. Please choose between 1 and 4.");
        }

        // Close the Scanner
        scanner.close();
    }
}
