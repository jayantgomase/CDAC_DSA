package binarySearch;

public class BinarySearch {
	
	// return index, -1 if does not exist
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			// middle element
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// target found
				return mid;
			}
		}
		return -1;
	}
}
