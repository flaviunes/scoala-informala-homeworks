import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTest {
	
	@Test
	public void stringWhiteSpacesRemoved(){
		// given
		String s = new String("Scoala informala de IT");
		StringUtility stringUtility = new StringUtility();
		// when
		String givenString = stringUtility.removeWhiteSpaces(s);
		// then
		String correctString = new String("ScoalainformaladeIT");
		Assert.assertEquals(correctString, givenString);
				
	}
	
	@Test
	public void stringWordNumberReplacedWithDigit() {
		String s = new String("One,Two,Three,Four,Five,Six,Seven,Eight,Nine");
		StringUtility stringUtility = new StringUtility();
		String givenString = stringUtility.replaceWordsWithDigits(s);
		String correctString = new String("1,2,3,4,5,6,7,8,9");
		Assert.assertEquals(correctString, givenString);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenEmptyStringUsed_ExceptionIsThrown(){
		String string = new String("");
		StringUtility stringUtility = new StringUtility();
		stringUtility.removeWhiteSpaces(string);
	}

}
