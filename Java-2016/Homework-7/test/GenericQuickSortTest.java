import org.junit.Assert;
import org.junit.Test;

/**
 * This is the test class for generic quicksort
 * 
 * @author Flaviu
 *
 */
public class GenericQuickSortTest {

	@Test
	public void stringQuicksort() {
		// given
		String[] strInput = { "eight", "ten", "twelve", "four", "fifty-three", "twelve number two" };
		GenericQuickSort genericSorter = new GenericQuickSort();
		// when
		String[] givenStringarray = (String[]) genericSorter.genericSort(strInput);
		// then
		String[] correctStringarray = { "eight", "fifty-three", "four", "ten", "twelve", "twelve number two" };
		Assert.assertEquals(correctStringarray, givenStringarray);

	}

	@Test
	public void doubleQuicksort() {
		// given
		Double[] doubleInput = { 88.0, 10.4, 12.42, 4.23, 53.6, 12.2 };
		GenericQuickSort genericSorter = new GenericQuickSort();
		// when
		Double[] givenDoublearray = (Double[]) genericSorter.genericSort(doubleInput);
		// then
		Double[] correctDoublearray = { 4.23, 10.4, 12.2, 12.42, 53.6, 88.0 };
		Assert.assertEquals(correctDoublearray, givenDoublearray);

	}

	@Test
	public void integerQuicksort() {
		// given
		Integer[] intInput = { 88, 10, 12, 4, 53, 12 };
		GenericQuickSort genericSorter = new GenericQuickSort();
		// when
		Integer[] givenIntegerarray = (Integer[]) genericSorter.genericSort(intInput);
		// then
		Integer[] correctIntegerarray = { 4, 10, 12, 12, 53, 88 };
		Assert.assertEquals(correctIntegerarray, givenIntegerarray);

	}

	@Test(expected = IllegalArgumentException.class)
	public void whenStringarrayIsEmpty_ExceptionIsThrown() {
		String[] stringInput = new String[0];
		GenericQuickSort genericSorter = new GenericQuickSort();
		genericSorter.genericSort(stringInput);

	}

	@Test(expected = IllegalArgumentException.class)
	public void whenStringarrayIsNull_ExceptionIsThrown() {
		String[] stringInput = null;
		GenericQuickSort genericSorter = new GenericQuickSort();
		genericSorter.genericSort(stringInput);

	}

}
