package startNew;

public class MyCharClass {

	static char ch;

	public MyCharClass(char ch) {
		super();
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'A') {
			return true;
		}
		if (ch == 'e' || ch == 'E') {
			return true;
		}
		if (ch == 'i' || ch == 'I') {
			return true;
		}
		if (ch == 'o' || ch == 'O') {
			return true;
		}
		if (ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}
	public boolean isConsonent() {
		if(isAlphabet() && !isVowel()) 
			return true;
		return false;
	}

	/*
	 * public boolean isConsonant(char ch) { if (ch == 'a' || ch == 'A') { return
	 * false; } if (ch == 'e' || ch == 'E') { return false; } if (ch == 'i' || ch ==
	 * 'I') { return false; } if (ch == 'o' || ch == 'O') { return false; } if (ch
	 * == 'u' || ch == 'U') { return false; } return true; }
	 */
	
	//Ternary operator instead of if else condition
	boolean isDigit = ((ch>=48 && ch<=57) ? true : false);
	
	public boolean isDigit() {
		if(ch>=48 && ch<=57) {
			return true;
		}
		return false;
	}
	
	public boolean isAlphabet() {
		if(ch>=65 && ch<=90) {
			return true;
		}
		if(ch>=97 && ch<=122) {
			return true;
		}
		return false;
	}
	
	public static void printLowerCaseAlphabet() {
		for(char ch ='a'; ch<='z';ch++) {
			System.out.println(ch);
		}
	}
	
	public void printUpperCaseAlphabet() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		MyCharClass myChar = new MyCharClass('8');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		printLowerCaseAlphabet();
		myChar.printUpperCaseAlphabet();
		System.out.println(myChar.isDigit());
	}

}
