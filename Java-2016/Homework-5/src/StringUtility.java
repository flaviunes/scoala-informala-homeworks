import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Map;

import com.sun.nio.zipfs.ZipDirectoryStream;
import com.sun.prism.paint.RadialGradient;

public class StringUtility {

	public String removeWhiteSpaces(String s) {
		return s.replaceAll("\\s+", "");
	}

	public String replaceWordsWithDigits(String s) {
		String lowerString = s.toLowerCase();
		String returnString;
		int index = 0;
		boolean contains = (lowerString.contains(" one ") || lowerString.startsWith("one")
				|| lowerString.endsWith("one"));
		if (contains == true) {
			index = lowerString.indexOf("one");
			returnString = lowerString.replace("one", "1");
			String oneRandomCase = s.substring(index, index + 3);
			String oneDigit = returnString.substring(index, index + 1);
			s = s.replace(oneRandomCase, oneDigit);
		}

		contains = (lowerString.contains(" two ") || lowerString.startsWith("two") || lowerString.endsWith("two"));
		if (contains == true) {
			index = lowerString.indexOf("two");
			returnString = lowerString.replace("two", "2");
			String twoRandomCase = s.substring(index, index + 3);
			String twoDigit = returnString.substring(index, index + 1);
			s = s.replace(twoRandomCase, twoDigit);
		}

		contains = (lowerString.contains(" three ") || lowerString.startsWith("three")
				|| lowerString.endsWith("three"));
		if (contains == true) {
			index = lowerString.indexOf("three");
			returnString = lowerString.replace("three", "3");
			String threeRandomCase = s.substring(index, index + 5);
			String threeDigit = returnString.substring(index, index + 1);
			s = s.replace(threeRandomCase, threeDigit);
		}

		contains = (lowerString.contains(" four ") || lowerString.startsWith("four") || lowerString.endsWith("four"));
		if (contains == true) {
			index = lowerString.indexOf("four");
			returnString = lowerString.replace("four", "4");
			String fourRandomCase = s.substring(index, index + 4);
			String fourDigit = returnString.substring(index, index + 1);
			s = s.replace(fourRandomCase, fourDigit);
		}

		contains = (lowerString.contains(" five ") || lowerString.startsWith("five") || lowerString.endsWith("five"));
		if (contains == true) {
			index = lowerString.indexOf("five");
			returnString = lowerString.replace("five", "5");
			String fiveRandomCase = s.substring(index, index + 4);
			String fiveDigit = returnString.substring(index, index + 1);
			s = s.replace(fiveRandomCase, fiveDigit);
		}

		contains = (lowerString.contains(" six ") || lowerString.startsWith("six") || lowerString.endsWith("six"));
		if (contains == true) {
			index = lowerString.indexOf("six");
			returnString = lowerString.replace("six", "6");
			String sixRandomCase = s.substring(index, index + 3);
			String sixDigit = returnString.substring(index, index + 1);
			s = s.replace(sixRandomCase, sixDigit);
		}

		contains = (lowerString.contains(" seven ") || lowerString.startsWith("seven")
				|| lowerString.endsWith("seven"));
		if (contains == true) {
			index = lowerString.indexOf("seven");
			returnString = lowerString.replace("seven", "7");
			String sevenRandomCase = s.substring(index, index + 5);
			String sevenDigit = returnString.substring(index, index + 1);
			s = s.replace(sevenRandomCase, sevenDigit);
		}

		contains = (lowerString.contains(" eight ") || lowerString.startsWith("eight")
				|| lowerString.endsWith("eight"));
		if (contains == true) {
			index = lowerString.indexOf("eight");
			returnString = lowerString.replace("eight", "8");
			String eightRandomCase = s.substring(index, index + 5);
			String eightDigit = returnString.substring(index, index + 1);
			s = s.replace(eightRandomCase, eightDigit);
		}

		contains = (lowerString.contains(" nine ") || lowerString.startsWith("nine") || lowerString.endsWith("nine"));
		if (contains == true) {
			index = lowerString.indexOf("nine");
			returnString = lowerString.replace("nine", "9");
			String nineRandomCase = s.substring(index, index + 4);
			String nineDigit = returnString.substring(index, index + 1);
			s = s.replace(nineRandomCase, nineDigit);
		}

		contains = (lowerString.contains(" zero ") || lowerString.startsWith("zero") || lowerString.endsWith("zero"));
		if (contains == true) {
			index = lowerString.indexOf("zero");
			returnString = lowerString.replace("zero", "0");
			String zeroRandomCase = s.substring(index, index + 4);
			String zeroDigit = returnString.substring(index, index + 1);
			s = s.replace(zeroRandomCase, zeroDigit);
		}

		return s;
	}
}
