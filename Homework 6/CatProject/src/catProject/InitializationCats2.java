package catProject;

public class InitializationCats2 {

	public static void main(String[] args) {
		
		Cat[] catArray = new Cat[10];
		
		catArray[0] = new Cat("Muri", 34);
		catArray[1] = new Cat("Gosho", 15);
		catArray[2] = new Cat("Doni", 22);
		catArray[3] = new Cat("Neti", 20);
		catArray[4] = new Cat("Pesho", 23);
		catArray[5] = new Cat("Iva", 16);
		catArray[6] = new Cat("Rex", 15);
		catArray[7] = new Cat("Neron", 40);
		catArray[8] = new Cat("Ares", 19);
		catArray[9] = new Cat("Pikachy", 14);

		for(Cat cat: catArray){
			cat.Say();
		}

	}

}
