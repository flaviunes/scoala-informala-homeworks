/**
 * Implement a generic quicksort sort algorithm that works with all types of
 * data that are comparable.
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

		GenericQuickSort sorter = new GenericQuickSort();
		int[] input = {88, 10, 12, 4, 33, 5, 99, 53, 12 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
