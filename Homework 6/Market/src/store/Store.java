package store;

import java.util.Scanner;

import market.*;

public class Store {

	private String nameStore;
	private String adressStore;
		
	public String getNameStore() {
		return this.nameStore;
	}
	
	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}
	
	public String getAdressStore() {
		return this.adressStore;
	}
	
	public void setAdressStore(String adressStore) {
		this.adressStore = adressStore;
	}
	
	public static void main(String[] arguments){
		Scanner inputs = new Scanner(System.in, "UTF-8");
		System.out.print("How many products will you add: ");
		int size = inputs.nextInt();
		
		Stock[] products = new Stock[size];
		
		initilElemets(products, inputs);
		
		System.out.println("Number of items are " + Stock.countElem);
		
		inputs.close();
	}
	
	public static void initilElemets(Stock[] prod, Scanner inputs){
		for(int i = 0; i < prod.length; i++){
			menuItems(prod[i], inputs);
		}
	}
	
	public static void menuItems(Stock item, Scanner inputs){
		System.out.println("Items: ");
		System.out.println("1. Drink");
		System.out.println("2. Meat");
		System.out.println("3. Fruit");
		System.out.println("4. Sweet");
		System.out.println("5. Vegetable");
		System.out.print("Choose item: ");
		
		int choise = inputs.nextInt();
		
		switch(choise){
		case 1: classDrinks(inputs, item);
		case 2: classMeat(inputs, item);
		case 3: classFruits(inputs, item);
		case 4: classSweet(inputs, item);
		case 5: classVegetables(inputs, item);
		}
	}
	
	public static void inputPriceStock(Scanner inputs, Stock item){
		System.out.print("Enter price: ");
		double price = inputs.nextDouble();
		
		System.out.print("Enter stock: ");
		boolean stock = inputs.nextBoolean();
		
		item.setPrice(price);
		item.setStock(stock);
	}

	public static void classDrinks(Scanner inputs, Stock item){
		Drinks drink = new Drinks();
		inputPriceStock(inputs, drink);
		
		System.out.print("Enter alcohol persentage: ");
		String alcPer = inputs.nextLine();
		
		System.out.print("Enter carbonate persentage: ");
		double carboPer = inputs.nextDouble();
		
		drink.setAlcoholPer(alcPer);
		drink.setCarbonate(carboPer);
		
		item = drink;
	}
	
	public static void classFruits(Scanner inputs, Stock item){
		Fruits fruit = new Fruits();
		inputPriceStock(inputs, fruit);
		
		System.out.print("Enter taste: ");
		String taste = inputs.nextLine();
		
		System.out.print("Enter water persentage: ");
		double water = inputs.nextDouble();
		
		fruit.setTaste(taste);
		fruit.setWaterPer(water);
		
		item = fruit;
	}
	
	public static void classMeat(Scanner inputs, Stock item){
		Meat meat = new Meat();
		inputPriceStock(inputs, meat);
		
		System.out.print("Enter taste: ");
		String kind = inputs.nextLine();
		
		System.out.print("Enter fat persentage: ");
		double fat = inputs.nextDouble();
		
		meat.setKindMeat(kind);
		meat.setFatPer(fat);
		
		item = meat;
	}
	
	public static void classSweet(Scanner inputs, Stock item){
		Sweet sweet = new Sweet();
		inputPriceStock(inputs, sweet);
		
		System.out.print("Enter kind: ");
		String kind = inputs.nextLine();
		
		System.out.print("Enter cokolate persentage: ");
		double coko = inputs.nextDouble();
		
		sweet.setChocolatePer(coko);
		sweet.setKind(kind);
		
		item = sweet;
	}
	
	public static void classVegetables(Scanner inputs, Stock item){
		Vegetables veg = new Vegetables();
		inputPriceStock(inputs, veg);
		
		System.out.print("Enter color: ");
		String color = inputs.nextLine();
		
		System.out.print("Enter size: ");
		double size = inputs.nextDouble();
		
		veg.setColor(color);
		veg.setSize(size);
		
		item = veg;
	}
	
	public static void printItems(Stock[] prod){
		for(int i = 0; i < prod.length ; i++){
			if(prod[i] instanceof Meat){
				System.out.println("The price of the meat is: " + ((Meat)prod[i]).getPrice());
				System.out.println("Is the meat in stock: " + ((Meat)prod[i]).isStock());
				System.out.println("The kind of meat is: " + ((Meat)prod[i]).getKindMeat());
				System.out.println("The fat of meat is: " + ((Meat)prod[i]).getFatPer());
			}else if(prod[i] instanceof Drinks){
				System.out.println("The price of the drink is: " + ((Drinks)prod[i]).getPrice());
				System.out.println("Is the drink in stock: " + ((Drinks)prod[i]).isStock());
				System.out.println("The alcohol persentage of drink is: " + ((Drinks)prod[i]).getAlcoholPer());
				System.out.println("The carbonate percentage of drink is: " + ((Drinks)prod[i]).getCarbonate());
			}else if(prod[i] instanceof Fruits){
				System.out.println("The price of the fruit is: " + ((Fruits)prod[i]).getPrice());
				System.out.println("Is the fruit in stock: " + ((Fruits)prod[i]).isStock());
				System.out.println("The taste of fruit is: " + ((Fruits)prod[i]).getTaste());
				System.out.println("The water percentage of fruit is: " + ((Fruits)prod[i]).getWaterPer());
			}else if(prod[i] instanceof Sweet){
				System.out.println("The price of the sweet is: " + ((Sweet)prod[i]).getPrice());
				System.out.println("Is the sweet in stock: " + ((Sweet)prod[i]).isStock());
				System.out.println("The kind of sweet is: " + ((Sweet)prod[i]).getKind());
				System.out.println("The chocolate percentage of sweet is: " + ((Sweet)prod[i]).getChocolatePer());
			}else if(prod[i] instanceof Vegetables){
				System.out.println("The price of the vegetable is: " + ((Vegetables)prod[i]).getPrice());
				System.out.println("Is the vegetable in stock: " + ((Vegetables)prod[i]).isStock());
				System.out.println("The color of vegetable is: " + ((Vegetables)prod[i]).getColor());
				System.out.println("The size of vegetable is: " + ((Vegetables)prod[i]).getSize());
			}
			
		}
	}
	
	public void stockChange(Stock elem){
		elem.setStock(false);
	}
	
}
