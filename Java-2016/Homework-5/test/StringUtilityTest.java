import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTest {

	
	@Test
	public void stringWhiteSpacesRemoved(){
		// given
		String s = new String("Scoala informala de IT");          //pe cine testezi
		StringUtility stringUtility = new StringUtility();        //dependintele obiectului
		// when
		String givenString = stringUtility.removeWhiteSpaces(s);  //actiune
		// then
		String correctString = new String("ScoalainformaladeIT"); //verificare obiect dupa initializere
		Assert.assertEquals(correctString, givenString);          //comparatie
				
	}
	
	@Test
	public void stringWordNumberReplacedWithDigit() {
		//given
		String s = "One Two Three Four Five Six Seven Eight Nine";
		StringUtility stringUtility = new StringUtility();
		//when
		String givenString = stringUtility.replaceWordsWithDigits(s);
		//then
		String correctString = new String("1 2 3 4 5 6 7 8 9");
		Assert.assertEquals(correctString, givenString);
		
	}
	
	@Test
	public void stringWordNumberReplaceUpperCase() {
		String string = "I have OnE apple";
		StringUtility stringUtility = new StringUtility();
		String returnedString = stringUtility.replaceWordsWithDigits(string);
		String correctString = "I have 1 apple";//space ala nu il am , credca deaia da fail
		Assert.assertEquals(correctString, returnedString);
	}
	
	@Test
	public void stringWordNumberReplaceLowerCase() {
		String string = "I have OnE apple";
		StringUtility stringUtility = new StringUtility();
		String returnedString = stringUtility.replaceWordsWithDigits(string);
		String correctString = "I have 1 apple";
		Assert.assertEquals(correctString, returnedString);
		
	}
	
	@Test
	public void stringWordNumberReplacedWithDigitOnlyIfAlone() {
		//given
		String s = new String("One Two Thirty-four Five Six Seven Eighty-nine");
		StringUtility stringUtility = new StringUtility();
		//when
		String givenString = stringUtility.replaceWordsWithDigits(s);
		//then
		String correctString = new String("1 2 Thirty-four 5 6 7 Eighty-nine");
		Assert.assertEquals(correctString, givenString);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenEmptyStringUsed_ExceptionIsThrown(){
		String string = new String("");
		StringUtility stringUtility = new StringUtility();
		stringUtility.removeWhiteSpaces(string);
	}

}
