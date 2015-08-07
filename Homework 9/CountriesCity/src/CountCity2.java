import java.io.*;
import java.util.Scanner;

public class CountCity2 {
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		String pathCountries = "../CountriesCities/countries.txt";
		String pathCities = "../CountriesCities/cities.txt";
		String[] readCountries=null;
		
		try{
			readCountries = readFromFile(pathCountries, inputs);
			
			String[] writeCities = new String[readCountries.length];
			
			for(int i = 0; i < writeCities.length; i++){
				System.out.print("The capital of the country " + readCountries[i] + " is: ");
				writeCities[i] = inputs.nextLine();
			}
			
			writeToFile(writeCities, pathCities);

		}catch(IOException e) {
			System.out.println("Error: ");
			System.out.println(e.getMessage());
			System.exit(0);
		}finally {
			inputs.close();
		}
		
	}

	public static String[] readFromFile(String path, Scanner inputs) throws IOException{

			BufferedReader reader = new BufferedReader(new FileReader(path));
			StringBuilder sb = new StringBuilder();
			
			while (reader.ready()) {
				sb.append(reader.readLine());
				sb.append("\n");
			}
			
			reader.close();
			return sb.toString().split("\\n");
	}
	
	public static void writeToFile(String[] capitals, String path) throws IOException{
				
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		for(int i = 0; i < capitals.length; i++){
			writer.write(capitals[i]);
			writer.newLine();
		}
		
		writer.close();

	}

}
