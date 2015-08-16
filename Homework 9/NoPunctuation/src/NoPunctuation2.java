import java.io.*;
import java.io.IOException;

public class NoPunctuation2 {
	public static void main(String[] args) {
		
		String pathWithPunc = "../TestText/WithPunc.txt";
		String pathNoPunc = "../TestText/NoPunc.txt";
		try{
			
//		writeToFile(readFromFile(pathWithPunc), pathNoPunc);
		
		String[] readedInfo= readFromFile(pathWithPunc);
		writeToFile(readedInfo, pathNoPunc);
		
		}catch (IOException e) {
			System.out.println("Error: ");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public static String[] readFromFile(String pathWithPunc) throws IOException{
	
		BufferedReader reader = new BufferedReader(new FileReader(pathWithPunc));
		StringBuilder sb = new StringBuilder();
		
		while (reader.ready()) {
			sb.append(reader.readLine().replaceAll("[^a-zA-Z0-9\\s]", " "));
			sb.append("\n");
		}
		
		reader.close();
		
		return sb.toString().split("\\n");
	}
	
	public static void writeToFile(String[] writeInfo, String pathNoPunc) throws IOException{
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(pathNoPunc, true));
		
		for(int i = 0 ; i < writeInfo.length; i++){
			writer.write(writeInfo[i]);
			writer.newLine();
		}
		writer.close();
	}

}