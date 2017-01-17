/**
 * this is the main method for a generic quicksort sort algorithm and a
 * quicksrot algorithm that works with all types of data that are comparable.
 * 
 * 
 * 
 * Required:
 * 
 * The sort algorithm must be Generic
 * 
 * Algorithm may only work with Comparable objects.
 * 
 * Unit tests must be written, that probe the algorithm works.
 * 
 * Unit tests must cover: number sorting, string sorting, custom comparable
 * object sorting (your choice).
 * 
 * @author Flaviu
 *
 */
public class Main {

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();

		int[] inputArr = { 88, 10, 12, 4, 53, 12 };
		sorter.sort(inputArr);

		System.out.println("Non-generic int sorting :");

		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Doubles sorting :");

		GenericQuickSort genericSorter = new GenericQuickSort();
		Double[] doubleInput = { 88.0, 10.4, 12.42, 4.23, 53.6, 12.2 };
		genericSorter.genericSort(doubleInput);

		for (double i : doubleInput) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Integers sorting :");

		Integer[] intInput = { 88, 10, 12, 4, 53, 12 };
		genericSorter.genericSort(intInput);

		for (int i : intInput) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Strings sorting :");

		String[] strInput = { "eight", "ten", "twelve", "four", "fifty-three", "twelve number two" };
		genericSorter.genericSort(strInput);

		for (String i : strInput) {
			System.out.print(i);
			System.out.print(" ");
		}

	}
}
