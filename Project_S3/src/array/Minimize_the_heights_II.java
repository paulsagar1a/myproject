package array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
public class Minimize_the_heights_II {

	public static void main(String[] args) {
		int[] arr = {8, 5, 1, 10};
		int k = 2;
		int ans = minimizeHeights(arr, k);
		
		System.out.println(ans);
	}

	private static int minimizeHeights(int[] arr, int k) {
		Arrays.sort(arr);
		int n = arr.length - 1;
		int diff = arr[n-1] - arr[0];
		int max = arr[n-1] - k;
		int min = arr[0] + k;
		
		for(int i=0; i<n-1; i++) {
			int new_max = Math.max(max, arr[i]+k);
			int new_min = Math.min(min, arr[i+1]-k);
			diff = Math.min(diff, new_max-new_min);
		}
		return diff;
	}

}
