package Lec04_UnitTest;

public class BinarySearch {
	public static int binarySearch(int[] list,int key) {
		int low = 1;
		int high = list.length;
		int mid = low + (high - low) / 2;
		while (low <= high) {
			if (list[mid] == key) {
				return mid;
			} else if (list[mid] > key) {
				high = mid + 1;
			} else {
				low = mid - 1;
			}
		}
		return -1;
	}
	
}
