
public class GenericQuickSort {

	private int array[];
	private int length;

	public <T extends Comparable<T>> T[] genericSort(T[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}
		boolean sorted =false;
		while (!sorted) {
			sorted = true;
			
			
		}
		
		
		
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}

		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}