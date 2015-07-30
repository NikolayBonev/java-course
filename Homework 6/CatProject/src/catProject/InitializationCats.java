package catProject;

public class InitializationCats {

	public static void main(String[] args) {

		Cat[] catArray = {new Cat("Muri", 34), new Cat("Gosho", 15), new Cat("Doni", 22), new Cat("Neti", 20), new Cat("Pesho", 23),
				new Cat("Iva", 16), new Cat("Rex", 15), new Cat("Neron", 40), new Cat("Ares", 19), new Cat("Pikachy", 14)};
		
		for(Cat cat: catArray){
			cat.Say();
		}
	}

}
