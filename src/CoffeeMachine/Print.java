package CoffeeMachine;


import java.util.Scanner;

public class Print {
	int coffeeCount=0;
	int money=0;
	CoffeeMachine coffeeMachine=new CoffeeMachine();
	Prices prices=new Prices();
    Scanner scanner=new Scanner(System.in);
    String type="";
	public void display() {
		System.out.println("----Welcome to CoffeeMachine----");
		System.out.println(CoffeeType.Cappuccino +" "+"10$");
		System.out.println(CoffeeType.Latte+" "+"12$");
		System.out.println(CoffeeType.Espresso+" "+"15$");
		System.out.println("Analysis :");
		System.out.println("Please Eneter your Coffee: ");
		type=scanner.nextLine();
		createCoffee(type);
    }
	
	private void createCoffee(String type2) {
		if(type2.equals("Cappuccino")) {
			MakeCappuccino makeCappuccino=new MakeCappuccino();
			makeCappuccino.createCoffee();
			printbill(CoffeeType.Cappuccino);
		}
		else if(type2.equals("Latte")) {
			MakeLatte makeLatte=new MakeLatte();
			makeLatte.createCoffee();
			printbill(CoffeeType.Latte);
		}
		else if(type2.equals("Espresso")) {
			MakeExprosso makeExprosso=new MakeExprosso();
			makeExprosso.createCoffee();
			printbill(CoffeeType.Espresso);
		}
		else if(type2.equals("Analysis")) {
			analysis();
		}
		else {
			System.out.println("Please Enter Proper Details");
		}
		
	}
	
	public void printbill(CoffeeType coffeeType){
		System.out.print("Coffee Bill :" );
		System.out.println("Coffee :" +coffeeType);
		System.out.println("Bill :" +prices.getPricesHashMap(coffeeType));
		System.out.println("Thank You Visit Again!");
		coffeeCount++;
		money=money+prices.getPricesHashMap(coffeeType);
		System.out.println("---------------------------");
		display();
		
	}
	
	public void analysis() {
		System.out.println("Coffee Sale : " +coffeeCount);
		System.out.println("Money Earned :" +money);
		display();
	}

	
  
	
}
	

