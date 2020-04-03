import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Helper {
	
	
	
	public ArrayList<String> readInput(String filePath){
		Scanner in = null;
		try {
			in = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> splitArray = new ArrayList<String>();
		
		while(in.hasNextLine()){
			   splitArray.add(in.nextLine());
		}
		System.out.println(splitArray);
		in.close();
		return splitArray;
	}
	
	void writeFile(String text, String filename) {
		FileWriter writer;
		try {
		writer = new FileWriter("C:\\Users\\Matteo\\Desktop\\coding contest\\" + filename);
		writer.write(text);
		writer.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
	
}
