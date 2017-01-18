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
	
	@Test(expected = IllegalArgumentException.class)
	public void whenIntArrayIsNull_ExceptionIsThrown() {
		int[] inputArr = null;
		QuickSort sorter = new QuickSort();
		sorter.sort(inputArr);

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenIntArrayIsEmpty_ExceptionIsThrown() {
		int[] inputArr = new int[0];
		QuickSort sorter = new QuickSort();
		sorter.sort(inputArr);

	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void whenStringarrayIsNull_ExceptionIsThrown() {
//		String[] stringgInput = null;
//		GenericQuickSort genericSorter = new GenericQuickSort();
//		genericSorter.genericSort(stringgInput);
//
//	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void whenStringarrayIsEmpty_ExceptionIsThrown() {
//		String[] stringInput = new String[0];
//		GenericQuickSort genericSorter = new GenericQuickSort();
//		genericSorter.genericSort(stringInput);
//
//	}

}
