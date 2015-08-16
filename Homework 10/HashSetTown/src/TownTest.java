import java.util.HashSet;

public class TownTest {

	public static void main(String[] args) {
		
		HashSet<Town> towns = new HashSet<Town>();
		
		towns.add(new Town("Varna", "Bulgaria", 330000));
		towns.add(new Town("Sofia", "Bulgaria", 2000000));
		towns.add(new Town("Mosccow", "Russia", 20000000));
		towns.add(new Town("Rome", "Italy", 8400000));
		towns.add(new Town("Burgas", "Bulgaria", 400000));
		
		for(Town town: towns){
			System.out.println(town);
		}
		
		boolean isTown = false;
		for(Town town: towns){
			if(town.getTownName().equals("Varna")){
				isTown = true;
			}
		}
		
		System.out.println("Is there a town named Varna: " + isTown);
		
		Town removedTown = new Town();
		for(Town town: towns){
			if(town.getTownName().equals("Varna")){
				removedTown = town;
			}
		}
		boolean isRemoved = towns.remove(removedTown);
		
//		for(Town town: towns){
//			System.out.println(town);
//		}
		
		System.out.println("Is Varna removed: " + isRemoved);

	}

}