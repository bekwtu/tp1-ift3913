import java.io.*;
import java.util.Scanner;

public class FileManager{
	
	FileInputStream fStream;
	DataInputStream dataStream;
	BufferedReader buffReader;
	
	char nextChar;
	
	FileManager(String filename){		
		try {
			fStream = new FileInputStream("Ligue.ucd");
			 
			dataStream = new DataInputStream(fStream);
			buffReader = new BufferedReader(new InputStreamReader(dataStream));

			nextChar = (char) buffReader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String nextToken(){
		char strLine;
		String word = "";
		try {						
			// Ignore whitespaces
			while(Character.isWhitespace(nextChar)) {
				nextChar = (char) buffReader.read();
			}
			
			// Symbol
			if(Character.toString(nextChar).matches("[:;()]")) {
				word = Character.toString(nextChar);
				nextChar = (char) buffReader.read();
			}
			
			// Extract word
			while(Character.isLetterOrDigit(nextChar) 
					|| Character.toString(nextChar).matches("[_]")) {
				word += Character.toString(nextChar);
				nextChar = (char) buffReader.read();
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return word;
	}
}

