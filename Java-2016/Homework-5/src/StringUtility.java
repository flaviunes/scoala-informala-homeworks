
/**
 * This is a class for utility on a string.
 * 
 * @author Flaviu
 */
public class StringUtility {

	/**
	 * This method removes all white spaces and new rows from a string.
	 * 
	 */
	public String removeWhiteSpaces(String s) {

		if (s.length() == 0) {
			throw new IllegalArgumentException("String must not be empty.");
		} else {
			return s.replaceAll("\\s+", "");
		}
	}

	/**
	 * This method transforms all characters in a string to lower case
	 * characters , the method is searching for words from "zero" to "nine" and
	 * replaces them with digits from 0 to 9 , then it's returning the string
	 * transformed.
	 */
	public String replaceWordsWithDigits(String s) {
		String lowerString = s.toLowerCase();
		String returnString;
		int index = 0;
		boolean contains = containsDigit(lowerString, "one");

		if (contains == true) {
			index = lowerString.indexOf("one");
			returnString = lowerString.replace("one", "1");
			String oneRandomCase = s.substring(index, index + 3);
			String oneDigit = returnString.substring(index, index + 1);
			s = s.replace(oneRandomCase, oneDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "two");
		if (contains == true) {
			index = lowerString.indexOf("two");
			returnString = lowerString.replace("two", "2");
			String twoRandomCase = s.substring(index, index + 3);
			String twoDigit = returnString.substring(index, index + 1);
			s = s.replace(twoRandomCase, twoDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "three");
		if (contains == true) {
			index = lowerString.indexOf("three");
			returnString = lowerString.replace("three", "3");
			String threeRandomCase = s.substring(index, index + 5);
			String threeDigit = returnString.substring(index, index + 1);
			s = s.replace(threeRandomCase, threeDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "four");
		if (contains == true) {
			index = lowerString.indexOf("four");
			returnString = lowerString.replace("four", "4");
			String fourRandomCase = s.substring(index, index + 4);
			String fourDigit = returnString.substring(index, index + 1);
			s = s.replace(fourRandomCase, fourDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "five");
		if (contains == true) {
			index = lowerString.indexOf("five");
			returnString = lowerString.replace("five", "5");
			String fiveRandomCase = s.substring(index, index + 4);
			String fiveDigit = returnString.substring(index, index + 1);
			s = s.replace(fiveRandomCase, fiveDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "six");
		if (contains == true) {
			index = lowerString.indexOf("six");
			returnString = lowerString.replace("six", "6");
			String sixRandomCase = s.substring(index, index + 3);
			String sixDigit = returnString.substring(index, index + 1);
			s = s.replace(sixRandomCase, sixDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "seven");
		if (contains == true) {
			index = lowerString.indexOf("seven");
			returnString = lowerString.replace("seven", "7");
			String sevenRandomCase = s.substring(index, index + 5);
			String sevenDigit = returnString.substring(index, index + 1);
			s = s.replace(sevenRandomCase, sevenDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "eight");
		if (contains == true) {
			index = lowerString.indexOf("eight");
			returnString = lowerString.replace("eight", "8");
			String eightRandomCase = s.substring(index, index + 5);
			String eightDigit = returnString.substring(index, index + 1);
			s = s.replace(eightRandomCase, eightDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "nine");
		if (contains == true) {
			index = lowerString.indexOf("nine");
			returnString = lowerString.replace("nine", "9");
			String nineRandomCase = s.substring(index, index + 4);
			String nineDigit = returnString.substring(index, index + 1);
			s = s.replace(nineRandomCase, nineDigit);
		}
		lowerString = s.toLowerCase();

		contains = containsDigit(lowerString, "zero");
		if (contains == true) {
			index = lowerString.indexOf("zero");
			returnString = lowerString.replace("zero", "0");
			String zeroRandomCase = s.substring(index, index + 4);
			String zeroDigit = returnString.substring(index, index + 1);
			s = s.replace(zeroRandomCase, zeroDigit);
		}

		lowerString = s.toLowerCase();

		return s;
	}

	/**
	 * This method is verifying if a certain string is containing a specific
	 * digit or if the string it's starting or ending with that digit.
	 * 
	 */
	private boolean containsDigit(String lowerString, String stringDigit) {
		boolean contains = (lowerString.contains(" " + stringDigit + " ") || lowerString.startsWith(stringDigit + " ")
				|| lowerString.endsWith(" " + stringDigit) || lowerString.equals(stringDigit));
		return contains;
	}
}
