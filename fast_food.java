import java.util.Scanner;

public class fast_food {
	
	private int burgerPrice = 110;
    private int friesPrice = 70;
    private int pizzaPrice = 220;
    private int sandwichPrice = 70;
    private int coldCoffeePrice = 70;

	public void fast_food() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1 Burger: 110/-");
		System.out.println("2 Fries: 70/-");
		System.out.println("3 Pizza: 220/-");
		System.out.println("4 Sandwich: 70/-");
		System.out.println("5 Cold Coffee: 70/-");
	}

	public int getBurgerPrice() {
		return burgerPrice;
	}
	
	public int getFriesPrice() {
        return friesPrice;
    }
	
	public int getPizzaPrice() {
        return pizzaPrice;
    }
	
	public int getSandwichPrice() {
        return sandwichPrice;
    }
	
	public int getColdCoffeePrice() {
        return coldCoffeePrice;
    }
}
