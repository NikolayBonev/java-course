import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser; 

public class OddEvenLines {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		readFromFile(inputs);

		inputs.close();
	}

	public static void readFromFile(Scanner inputs){
		int count = 1;
		try {
			FileReader fileR = new FileReader(openFile());
			
			BufferedReader reader = new BufferedReader(fileR);
			String pathSave1 = saveFile();
			String pathSave2 = saveFile();
			
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
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public static void writeToFile(String input, String path){
		
		try {
			FileWriter fileStream = new FileWriter(path, true);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
				
			writer.write(input);
			writer.newLine();
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public static String openFile() {
		
		JFileChooser chooser = new JFileChooser();
		File file = new File("C:/");
		File filePath;
		chooser.setCurrentDirectory(file);
	    int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	filePath = chooser.getSelectedFile();
	    	String path = filePath.getAbsolutePath();
	    	return path;
	    }else{
	    	return null;
	    }
	    
	}
	
	public static String saveFile() {
		
		JFileChooser chooser = new JFileChooser();
		File file = new File("C:/");
		File filePath;
		chooser.setCurrentDirectory(file);
	    int returnVal = chooser.showSaveDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	filePath = chooser.getSelectedFile();
	    	String path = filePath.getAbsolutePath();
	    	return path;
	    }else{
	    	return null;
	    }
	    
	}
}
