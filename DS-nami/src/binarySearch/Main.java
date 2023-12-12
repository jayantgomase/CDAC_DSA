package binarySearch;

import static binarySearch.BinarySearch.binarySearch;

public class Main {

	public static void main(String[] args) {
		// sorted array required!
		int [] arr = {-24, -18, -9, 0, 2, 3, 4, 6, 12, 
				19 , 25, 36, 48, 55, 59, 67, 80, 99};
		int ans = binarySearch(arr, 36);
		if (ans == -1) {
			System.out.println("does not exist!");
		} else {
			System.out.println(arr[ans] + " found!");
		}
	}

}
