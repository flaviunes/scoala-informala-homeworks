
public class StringUtility {
	
	public String removeWhiteSpaces(String s) {
		return s.replaceAll("\\s+", "");
	}
	public String replaceWordsWithDigits(String s){
		return s.replaceAll("One", "1");
	}


}
