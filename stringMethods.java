package introductionTry3;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is a tennis racquet's string pattern";
		
		String str1 = "Babolat";
		String str2 = "Babolat";
		String str3 = "Head";
		String str4 = "Yonnex";
		String str5 = "";
		String str6 = "     Prince          ";
		String str7 = new String("Addidas");

		System.out.println("Length of string: " + str.length());
		System.out.println("Char at given index: " + str.charAt(3));
		System.out.println("Concats onto existing string: " + str.concat("Rafa"));
		System.out.println("Contains: " + str.contains("tennis"));
		System.out.println("Ends with: " + str.endsWith("n"));
		System.out.println("Starts with: " + str.startsWith("This"));
		System.out.println("Ends with: " + str.endsWith("pattern"));
		System.out.println("Checks string equality: " + str1.equals(str2));
		System.out.println("Gives index of specific character: "+ str3.indexOf("d"));
		System.out.println("Checks if empty: " + str4.isEmpty());
		System.out.println("Checks if empty: " + str5.isEmpty());
		System.out.println("Replace Example: " + str4.replace('n', 'z'));
		System.out.println("Replace Portion of string: " + str2.substring(3,5) + "---olay\n");
		
		// Convert given string into a char array
		char[] charArray = str.toCharArray();			// 1 define a char array
		for (int i = 0; i<charArray.length; i++) {		// iterate over the charArray
			System.out.println("Index " + i + " is: "+ charArray[i]);	// print the index
		}
		
		System.out.println("\nReturns lower case: " + str1.toLowerCase());
		System.out.println("Returns upper case: " + str1.toUpperCase());
		System.out.println("Trims the leading or trailing spaces: " + str6.trim());
		System.out.println("Uppercase string: " + str7.toUpperCase());
				
	}
 	
}
