/**
 * this is the main method for a generic quicksort sort algorithm and a
 * quicksrot algorithm that works with all types of data that are comparable.
 * 
 * 
 * @author Flaviu
 *
 */
public class Main {

	public static void main(String args[]) {

		System.out.println("Non-generic intArray sorting \n");

		QuickSort sorter = new QuickSort();

		int[] inputArr = { 88, 10, 12, 4, 53, 12 };

		if (inputArr.length == 0 || inputArr == null) {
			throw new IllegalArgumentException("This cannot be empty!! ");
		} else {
			sorter.sort(inputArr);
		}

		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Doubles Array GENERIC sorting \n");

		GenericQuickSort genericSorter = new GenericQuickSort();
		Double[] doubleInput = { 88.0, 10.4, 12.42, 4.23, 53.6, 12.2 };
		genericSorter.genericSort(doubleInput);

		for (double i : doubleInput) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Integers Array GENERIC sorting \n");

		Integer[] intInput = { 88, 10, 12, 4, 53, 12 };

		if (intInput.length == 0 || intInput == null) {
			throw new IllegalArgumentException("This list is empty!! ");
		} else {
			genericSorter.genericSort(intInput);

		}
		for (int i : intInput) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Strings Array GENERIC sorting \n");

		String[] strInput = { "eight", "ten", "twelve", "four", "fifty-three", "twelve number two" };
		if (strInput.length == 0 || strInput == null) {
			throw new IllegalArgumentException("This cannot be empty!! ");
		} else {
			genericSorter.genericSort(strInput);

		}

		for (String i : strInput) {
			System.out.print(i);
			System.out.print(" ");
		}

	}
}
