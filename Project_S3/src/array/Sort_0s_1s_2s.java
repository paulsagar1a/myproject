package array;

import java.util.Arrays;

public class Sort_0s_1s_2s {

	public static void main(String[] args) {
		int[] arr = {0, 2, 1, 1, 2, 0, 0, 1, 2};
		int lo = 0;
		int mid = 0;
		int hi = arr.length-1;
		while(mid<=hi) {
			switch(arr[mid]) {
				case 0:
					swap(arr, lo, mid);
					lo++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					swap(arr, mid, hi);
					hi--;
					break;
			}
		}
		
		System.out.print(Arrays.toString(arr));
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
