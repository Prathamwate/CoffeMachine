package CoffeeMachine;

import java.util.HashMap;
import java.util.Map.Entry;

public class MakeExprosso {
	 HashMap<Ingredient,Integer> ExprossoCoffee=new HashMap<>();
		CoffeeMachine coffeeMachine=new CoffeeMachine();
		
		public  MakeExprosso() {
			ExprossoCoffee.put(Ingredient.Milk,0);
			ExprossoCoffee.put(Ingredient.Water,250);
			ExprossoCoffee.put(Ingredient.Beans,16);
		}
		
		public void createCoffee() {
	        if(isIngredient()) {
	        	makeCoffee();
	            System.out.println("Expresso Dispatched");
	        } else {
	            throw new RuntimeException("Ingredients for Expresso is not sufficient");
	        }
	    }
		
		private boolean isIngredient() {
			 for(Entry<Ingredient, Integer> mapEntry : ExprossoCoffee.entrySet()) {
		            if(coffeeMachine.getQuantity(mapEntry.getKey()) < mapEntry.getValue())
		                return false;
		        }
		        return true;
		}
		private void makeCoffee() {
			 for(Entry<Ingredient, Integer> mapEntry : ExprossoCoffee.entrySet()) {
				 coffeeMachine.reduceQuantity(mapEntry.getKey(), mapEntry.getValue());
		        }
		}
}
