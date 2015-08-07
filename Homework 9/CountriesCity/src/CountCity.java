import java.io.*;
import java.util.Scanner;

public class CountCity {

	public static void main(String[] args) {
		
		String pathCountries = "../CountriesCities/countries.txt";
		String pathCities = "../CountriesCities/cities.txt";
		readFromFile(pathCountries, pathCities);
	}

	public static void readFromFile(String path1, String path2){
		Scanner inputs = new Scanner(System.in , "UTF-8");
		try {

			BufferedReader reader = new BufferedReader(new FileReader(path1));

			while (reader.ready()) {
					String line = reader.readLine();
					System.out.print("The capital of the country " + line + " is: ");
					writeToFile(inputs, path2);
			}
			reader.close();
			
			
		} catch (IOException e) {
			System.out.println("Error: ");
			System.out.println(e.getMessage());
			System.exit(0);
		}finally {
			inputs.close();
		}
	}
	
	public static void writeToFile(Scanner inputs, String path) throws IOException{
		
		String capital = inputs.nextLine();

		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
				
			writer.write(capital);
			writer.newLine();
			writer.close();
	}
}
