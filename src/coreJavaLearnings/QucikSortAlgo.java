package coreJavaLearnings;

import java.util.Arrays;

public class QucikSortAlgo {

	public static int partion(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j <= high; j++) {
			if (arr[j] < pivot) {
				i++;

				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
			System.out.println(Arrays.toString(arr));
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
		//	System.out.println(Arrays.toString(arr));
			int pidx = partion(arr, low, high);

			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high);

		}

	}

	// Driver code to test above
	public static void main(String args[]) {
		int[] arr = { 3, 14, 8, 23, 12 ,19};
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, n - 1);

		System.out.println(Arrays.toString(arr));
	}

}
