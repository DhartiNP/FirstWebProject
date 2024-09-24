package startNew;

import java.io.FileNotFoundException;

public class Throws_Runner {

	public static void main(String[] args) {
		Throws practice = new Throws();
		
		try {
			practice.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			practice.saveFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
