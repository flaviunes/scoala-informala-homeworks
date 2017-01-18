import org.junit.Assert;
import org.junit.Test;

/**
 * this is the test class for quicksort
 * 
 * @author Flaviu
 *
 */
public class QuickSortTest {

	@Test
	public void integerQuicksort() {
		// given
		int[] inputArr = { 88, 10, 12, 4, 53, 12 };
		QuickSort sorter = new QuickSort();
		// when
		sorter.sort(inputArr);
		// then
		int[] correctArray = { 4, 10, 12, 12, 53, 88 };
		Assert.assertArrayEquals(correctArray, inputArr);

	}

}
