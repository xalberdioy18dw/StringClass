
public class StringClass {
	public static void main(String args[]) {
		String str = new String ("Xabier Alberdi");
		System.out.println("The lenght of the string is:" + str.length());
		// It counts the letters of the string
		System.out.println("Name:" + str.substring(0, 6));
		System.out.println("Surname: " + str.substring(str.length() - 7));
		// It breaks the string
		System.out.println(str.trim());
		// Returns a copy of the string, with leading and trailing whitespace omitted.
		char str1 = str.charAt(5);
		System.out.println("The letter of the posicion number 5 is:" + str1);
		// It says you what letter is in the posicion you entered
		System.out.println(str.compareTo("xabier alberdi"));
		// It compares both strings, paying attention to the capital letters
		System.out.println(str.compareToIgnoreCase("xabier alberdi"));
		//  It compares both strings, without paying attention to the capital letters
		System.out.println(str.indexOf("a"));
		// It finds the first position of the letter or word you entered
		System.out.println(str.lastIndexOf("A"));
		// It finds the last position of the letter or word you entered
		
	}

}
