package first;
import java.io.*;

public class OddEvenLines {

	public static void main(String[] args) {
		try{
			readFromFile();
		} catch (Exception e) {
			System.out.println("Error: ");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public static void readFromFile() throws IOException{
		int count = 1;

		String readPath = FileChooser.openFile();
		BufferedReader reader = new BufferedReader(new FileReader(readPath));
		
		String localDirectory = readPath.substring(0, readPath.lastIndexOf("\\"));
		String pathSave1 = FileChooser.saveFile(localDirectory);
		String pathSave2 = FileChooser.saveFile(localDirectory);
		
		while (reader.ready()) {
				String line = reader.readLine();
				if(count%2==0){
					writeToFile(line, pathSave2);
				}
				else{
					writeToFile(line, pathSave1);
				}
				
				count++;
		}
			
		reader.close();
	}
	
	public static void writeToFile(String input, String path) throws IOException{
			
		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
				
		writer.write(input);
		writer.newLine();
		writer.close();
			
	}
	
}
