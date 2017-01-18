/**
 * This is the generic quicksort algorithm , which extends comparable
 * 
 * @author Flaviu
 *
 * @param <T>
 */
public class GenericQuickSort<T extends Comparable<T>> {

	private T[] array;
	private int length;

	public T[] genericSort(T[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
		}

		this.array = inputArr;
		length = inputArr.length;
		genericQuicksort(0, length - 1);
		return inputArr;
	}

	private void genericQuicksort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		T pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {

			while (array[i].compareTo(pivot) < 0) {
				i++;
			}
			while (array[j].compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}

		if (lowerIndex < j)
			genericQuicksort(lowerIndex, j);
		if (i < higherIndex)
			genericQuicksort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
