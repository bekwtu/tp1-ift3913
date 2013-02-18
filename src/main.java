import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class main {
	public static void main(String[] args){
    	
		FileManager fileManager = new FileManager("Ligue.ucd");
		for(int i = 0; i < 20; i++)
			System.out.println(fileManager.nextToken());
    }
}
