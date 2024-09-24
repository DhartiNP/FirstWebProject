package startNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws {

	public void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("c:abc.txt");
	}
	
	public void saveFile() throws FileNotFoundException{
		FileOutputStream fos = new FileOutputStream("C:/Users/piyus/xyz.txt");
	}
}
