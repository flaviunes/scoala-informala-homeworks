import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTest {

	@Test
	public void stringWhiteSpacesRemoved() {
		// given
		String string = "Scoala informala de IT";
		StringUtility stringUtility = new StringUtility();
		// when
		String givenString = stringUtility.removeWhiteSpaces(string);
		// then
		String correctString = "ScoalainformaladeIT";
		Assert.assertEquals(correctString, givenString);

	}

	@Test
	public void stringWordNumberReplacedWithDigit() {
		// given
		String string = "One Two Three Four Five Six Seven Eight Nine";
		StringUtility stringUtility = new StringUtility();
		// when
		String givenString = stringUtility.replaceWordsWithDigits(string);
		// then
		String correctString = new String("1 2 3 4 5 6 7 8 9");
		Assert.assertEquals(correctString, givenString);

	}

	@Test
	public void stringSingleWordNumberReplacedWithDigit() {
		// given
		String string = "One";
		StringUtility stringUtility = new StringUtility();
		// when
		String givenString = stringUtility.replaceWordsWithDigits(string);
		// then
		String correctString = new String("1");
		Assert.assertEquals(correctString, givenString);

	}

	@Test
	public void stringWordNumberReplaceUpperCase() {
		String string = "I have ONE apple";
		StringUtility stringUtility = new StringUtility();
		String returnedString = stringUtility.replaceWordsWithDigits(string);
		String correctString = "I have 1 apple";
		Assert.assertEquals(correctString, returnedString);
	}

	@Test
	public void stringWordNumberReplaceLowerCase() {
		String string = "I have one apple";
		StringUtility stringUtility = new StringUtility();
		String returnedString = stringUtility.replaceWordsWithDigits(string);
		String correctString = "I have 1 apple";
		Assert.assertEquals(correctString, returnedString);

	}

	@Test
	public void stringWordNumberReplacedWithDigitOnlyIfAlone() {
		// given
		String string = new String("One Two Thirty-four Five Six Seven Eighty-nine");
		StringUtility stringUtility = new StringUtility();
		// when
		String givenString = stringUtility.replaceWordsWithDigits(string);
		// then
		String correctString = "1 2 Thirty-four 5 6 7 Eighty-nine";
		Assert.assertEquals(correctString, givenString);

	}

	@Test
	public void stringWordNumberFollowedBySpecialCharacter() {
		// given
		String string = new String("Five six SEVEN eiGHt!!");
		StringUtility stringUtility = new StringUtility();
		// when
		String givenString = stringUtility.replaceWordsWithDigits(string);
		// then
		String correctString = "5 6 7 eiGHt!!";
		Assert.assertEquals(correctString, givenString);

	}

	@Test(expected = IllegalArgumentException.class)
	public void whenEmptyStringUsed_ExceptionIsThrown() {
		String string = new String("");
		StringUtility stringUtility = new StringUtility();
		stringUtility.removeWhiteSpaces(string);
	}

}
