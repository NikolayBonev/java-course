package market;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		
		classDrinks(inputs);
		classFruits(inputs);
		classMeat(inputs);
		classSweet(inputs);
		classVegetables(inputs);
		
		inputs.close();

	}
	
	public static void inputPriceStock(Scanner inputs, Stock item){
		System.out.print("Enter price: ");
		double price = inputs.nextDouble();
		
		System.out.print("Enter stock: ");
		boolean stock = inputs.nextBoolean();
		
		item.setPrice(price);
		item.setStock(stock);
	}

	public static void classDrinks(Scanner inputs){
		Drinks drink = new Drinks();
		inputPriceStock(inputs, drink);
		
		System.out.print("Enter alcohol persentage: ");
		String alcPer = inputs.nextLine();
		
		System.out.print("Enter carbonate persentage: ");
		double carboPer = inputs.nextDouble();
		
		drink.setAlcoholPer(alcPer);
		drink.setCarbonate(carboPer);
	}
	
	public static void classFruits(Scanner inputs){
		Fruits fruit = new Fruits();
		inputPriceStock(inputs, fruit);
		
		System.out.print("Enter taste: ");
		String taste = inputs.nextLine();
		
		System.out.print("Enter water persentage: ");
		double water = inputs.nextDouble();
		
		fruit.setTaste(taste);
		fruit.setWaterPer(water);
	}
	
	public static void classMeat(Scanner inputs){
		Meat meat = new Meat();
		inputPriceStock(inputs, meat);
		
		System.out.print("Enter taste: ");
		String kind = inputs.nextLine();
		
		System.out.print("Enter fat persentage: ");
		double fat = inputs.nextDouble();
		
		meat.setKindMeat(kind);
		meat.setFatPer(fat);
	}
	
	public static void classSweet(Scanner inputs){
		Sweet sweet = new Sweet();
		inputPriceStock(inputs, sweet);
		
		System.out.print("Enter kind: ");
		String kind = inputs.nextLine();
		
		System.out.print("Enter cokolate persentage: ");
		double coko = inputs.nextDouble();
		
		sweet.setChocolatePer(coko);
		sweet.setKind(kind);
	}
	
	public static void classVegetables(Scanner inputs){
		Vegetables veg = new Vegetables();
		inputPriceStock(inputs, veg);
		
		System.out.print("Enter color: ");
		String color = inputs.nextLine();
		
		System.out.print("Enter size: ");
		double size = inputs.nextDouble();
		
		veg.setColor(color);
		veg.setSize(size);
	}
}
