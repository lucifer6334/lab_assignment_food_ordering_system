import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*******Welcome to MagicHunt Restaurant*******");
        System.out.println("1 Show Menu");
        System.out.println("2 Exit");
        int choice = sc.nextInt();

        if (choice == 1) {
            menu menuObject = new menu();
            menuObject.menu();

            System.out.println("");
            System.out.println("What you like to eat 1 to 4");
            int cust1 = sc.nextInt();

            double totalBill = 0.0;

            if (cust1 == 1) {
                fast_food fast_foodObject = new fast_food();
                fast_foodObject.fast_food();

                boolean addMoreItems = true;

                while (addMoreItems) {
                    System.out.println("");
                    System.out.println("Enter fast food choice (1 to 5):");
                    int choice1 = sc.nextInt();

                    double itemPrice = calculateFastFoodPrice(choice1);
                    if (itemPrice > 0) {
                        totalBill += itemPrice;
                        System.out.println("Item added to the bill.");

                        System.out.println("Do you want to add more items? (y/n): ");
                        char addMore = sc.next().charAt(0);
                        addMoreItems = (addMore == 'y' || addMore == 'Y');
                        
                        
                    } else {
                        System.out.println("Invalid choice. Try again.");
                    }
                    
                }
            } else if (cust1 == 2) {
                Starter StarterObject = new Starter();
                StarterObject.starter();
                
                boolean addMoreItems = true;
                
                while (addMoreItems) {
                	System.out.println("");
                    System.out.println("Enter Starter choice (1 to 4):");
                    int choice1 = sc.nextInt();
                    
                    double itemPrice = calculateStarterPrice(choice1);
                    if (itemPrice > 0) {
                    	totalBill += itemPrice;
                    	System.out.println("Item added to the bill.");
                    	
                    	System.out.println("Do you want to add more items? (y/n): ");
                        char addMore = sc.next().charAt(0);
                        addMoreItems = (addMore == 'y' || addMore == 'Y');
                    }else {
                    	System.out.println("Invalid choice. Try again.");
                    }
                }
                // ...
            } else if (cust1 == 3) {
                main_course main_courseObject = new main_course();
                main_courseObject.main_course();
                
                boolean addMoreItems = true;
                
                while (addMoreItems) {
                	System.out.println("");
                	System.out.println("Enter MainCourse choice (1 to 5");
                	int choice1 = sc.nextInt();
                	
                	double itemPrice = calculatemain_coursePrice(choice1);
                	if (itemPrice > 0) {
                		totalBill += itemPrice;
                	System.out.println("Item added to the bill.");
                	
                	System.out.println("Do you want to add more items? (y/n): ");
                	char addMore = sc.next().charAt(0);
                	addMoreItems = (addMore == 'y' || addMore == 'Y');
                	}
                	else {
                		System.out.println("Invalid choice. Try again.");
                	}
                }
            } else if (cust1 == 4) {
                Dessert DessertObject = new Dessert();
                DessertObject.Dessert();
                
                boolean addMoreItems = true;
                
                while (addMoreItems) {
                	System.out.println("");
                	System.out.println("Enter Dessert choice (1 to 5");
                	int choice1 = sc.nextInt();
                	
                	double itemPrice = calculateDessertPrice(choice);
                	if (itemPrice >0) {
                		totalBill += itemPrice;
                		
                	System.out.println("Item added to the bill.");
                	System.out.println("Do you want to add more items? (y/n): ");
                	char addMore = sc.next().charAt(0);
                	addMoreItems = (addMore == 'y' || addMore == 'Y');
                	}
                	else {
                		System.out.println("Invalid choice. Try again.");
                	}
                	
                }
            } else {
                System.out.println("Enter a valid number");
            }

            System.out.println("Your total bill is: ₹" + totalBill);
            System.out.println("Thank you for dining with us!");
        } else if (choice == 2) {
            System.out.println("Thank you! Visit again.");
        }
    }

    // Implement the methods to calculate the price for each fast food item
    private static double calculateFastFoodPrice(int choice1) {
        switch (choice1) {
            case 1:
                return 110; // Price for Burger
            case 2:
                return 70; // Price for Fries
            case 3:
                return 220; // Price for Pizza
            case 4:
                return 70; // Price for Sandwich
            case 5:
                return 70; // Price for ColdCoffee
            default:
                return -1.0; // Invalid choice
        }
    }
    
    
 // Implement the methods to calculate the price for each starter item
    private static double calculateStarterPrice(int choice1) {
        switch (choice1) {
            case 1:
                return 180; //Price for Starter Item 1
            case 2:
                return 210; // Price for Starter Item 2
            case 3:
                return 180;//Price for Starter Item 3
            case 4:
                return 280; // Price for Starter Item 4
            default:
                return -1.0; // Invalid choice
        }
    }
 // Implement the methods to calculate the price for each main_course item
    
    private static double calculatemain_coursePrice(int choice1) {
        switch (choice1) {
            case 1:
                return 180; //Price for main_course Item 1
            case 2:
                return 210; // Price for main_course Item 2
            case 3:
                return 180;//Price for main_course Item 3
            case 4:
                return 210; //Price for main_course Item 4
            case 5:
            	return 210; //Price for main_course Item 5
            	default:
            		
                return -1.0; // Invalid choice
        }
    }
    
 // Implement the methods to calculate the price for each Dessert item
    
    private static double calculateDessertPrice(int choice1) {
    	switch (choice1) {
    	case 1:
    		return 60;   	
    	case 2:
    		return 85;
    	case 3:
    		return 80;
    	case 4:
    		return 100;
    	case 5:
    		return 110;
    	default:
    		
            return -1.0;
    		}
    }
}

